-- Insert sample data into destination table
INSERT INTO destination (name, country, description) VALUES
    ('Paris', 'France', 'City of Lights'),
    ('Tokyo', 'Japan', 'Vibrant city with rich culture'),
    ('New York City', 'USA', 'The Big Apple'),
    ('Rome', 'Italy', 'Historical city with ancient ruins'),
    ('Sydney', 'Australia', 'Harbor city with iconic Opera House');

-- Insert sample data into travel_history table
INSERT INTO travel_history (traveler_name, travel_date, destination_id) VALUES
    ('John Doe', '2023-01-15', 1),   -- Paris
    ('Alice Smith', '2023-02-20', 2),   -- Tokyo
    ('Michael Brown', '2023-03-10', 3),   -- New York City
    ('Emma Johnson', '2023-04-05', 4),   -- Rome
    ('James Wilson', '2023-05-12', 5);   -- Sydney
