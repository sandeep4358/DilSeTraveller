-- Create destination table
CREATE TABLE destination (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    country VARCHAR(255),
    description TEXT
);

-- Create travel_history table
CREATE TABLE travel_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    traveler_name VARCHAR(255),
    travel_date DATE,
    destination_id BIGINT,
    FOREIGN KEY (destination_id) REFERENCES destination(id)
);
