insert into reward (title, description, image_url, state)
values ('Reward 1', 'Description for Reward 1',
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 'NOT_AVAILABLE'),
       ('Reward 2', 'Description for Reward 2',
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 'ACQUIRED'),
       ('Reward 1', 'Description for Reward 1',
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 'USED');

insert into challenge (title, description, experience_points, image_url, progress, state, reward_id)
values ('Challenge 1', 'Description for Challenge 1', 1,
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 0, 'AVAILABLE', 1),
       ('Challenge 2', 'Description for Challenge 2', 2,
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 0.33, 'ACTIVE', 2),
       ('Challenge 3', 'Description for Challenge 3', 3,
        'https://the7eagles.com/wp-content/uploads/2024/05/Parts-of-Image-URL-1.webp', 0.66, 'DONE', 3);
