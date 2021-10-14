INSERT INTO person (id, name) VALUES (1, 'Yannic');
INSERT INTO person (id, name) VALUES (2, 'Bud');

INSERT INTO skill (id, name) VALUES (1, 'Software Development');
INSERT INTO skill (id, name) VALUES (2, 'Eat');
INSERT INTO skill (id, name) VALUES (3, 'Sleep');

INSERT INTO person_skills (person_id, skill_id) VALUES (1, 1); -- Yannic, Software Development
INSERT INTO person_skills (person_id, skill_id) VALUES (1, 2); -- Yannic, Eat
INSERT INTO person_skills (person_id, skill_id) VALUES (1, 3); -- Yannic, Sleep
INSERT INTO person_skills (person_id, skill_id) VALUES (2, 2); -- Bud, Eat
INSERT INTO person_skills (person_id, skill_id) VALUES (2, 3); -- Bud, Sleep