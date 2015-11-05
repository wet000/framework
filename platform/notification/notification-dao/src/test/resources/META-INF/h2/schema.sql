CREATE TABLE IF NOT EXISTS subscriber (
	id int IDENTITY PRIMARY KEY,
	form_id smallint,
	email varchar,
	active tinyint,
	confirmed tinyint,
	create_date date,
	activate_date date,
	deactivate_date date,
	confirm_date date,
	version date
)