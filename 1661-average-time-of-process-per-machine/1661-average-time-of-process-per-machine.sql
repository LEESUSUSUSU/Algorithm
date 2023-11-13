SELECT 
    machine_id, 
    ROUND(AVG(end_time - start_time), 3) AS processing_time
FROM (
    SELECT 
        start.machine_id,
        start.process_id,
        start.timestamp AS start_time,
        MIN(end.timestamp) AS end_time
    FROM 
        Activity start
    INNER JOIN 
        Activity end 
    ON start.machine_id = end.machine_id 
       AND start.process_id = end.process_id 
       AND start.activity_type = 'start' 
       AND end.activity_type = 'end'
    WHERE 
        end.timestamp >= start.timestamp
    GROUP BY 
        start.machine_id, start.process_id, start.timestamp
) AS process_times
GROUP BY 
    machine_id;
