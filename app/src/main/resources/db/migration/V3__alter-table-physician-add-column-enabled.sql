alter table physicians add enabled tinyint;
update physicians set physicians.enabled = 1;