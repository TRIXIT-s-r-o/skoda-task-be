delete
from reward;

insert into reward (id, title, description, image_url, state) overriding system value
values (1, 'Care connect', 'Get a 10% discount on Care connect feature.',
        'https://gitlab.megumethod.dev/megumethod/skoda-auto/tender/icons/-/raw/main/icons/png/care-connect-icon.png?ref_type=heads&inline=false', 'ACQUIRED'),
       (2, 'Pay to park', 'Apply a 5% discount on every payment made by Pay to park service.',
        'https://gitlab.megumethod.dev/megumethod/skoda-auto/tender/icons/-/raw/main/icons/png/pay-to-park-icon.png?ref_type=heads&inline=false', 'ACQUIRED'),
       (3, 'Infotainment online', 'Free online infotainment for one month.',
        'https://gitlab.megumethod.dev/megumethod/skoda-auto/tender/icons/-/raw/main/icons/png/infotainment-icon.png?ref_type=heads&inline=false', 'ACQUIRED');

insert into challenge (title, description, experience_points, image_url, progress, state, reward_id)
values ('ECO Driving',
        'Join our ECO Driving Challenge and master efficient driving with your ŠKODA! For one month, track your fuel consumption and improve your driving habits. Compete with others, proving that eco-friendly driving benefits both the environment and your wallet. All participants will get feedback and tips, and the best drivers will win great prizes. Join us in creating a greener future!',
        1, 'https://drive.google.com/uc?export=view&id=14kdnVfu-G70tbchhwx8V01Q-nHKJ01oB', 0, 'AVAILABLE', 1),
       ('Regular Maintenance',
        'Keep your ŠKODA in top condition with our Regular Maintenance Challenge! This monthly challenge highlights the importance of regular maintenance to keep your car reliable and safe. Learn best practices, get service offers, and share experiences with other drivers. At the end of the month, responsible participants will be rewarded with valuable prizes. Stay safe and join the challenge!',
        1, 'https://drive.google.com/uc?export=view&id=1dYt4ppSMaMQ9ECtDBbKt8xTkLKiyItvJ', 0, 'AVAILABLE', 2),
       ('Decent driver',
        'Join our Speed Limit Compliance Challenge and become a model driver! This initiative focuses on safety and respect for traffic laws. The goal is to follow speed limits all month, making roads safer. Share your experiences, get safe driving tips, and learn how to plan efficient routes. Exemplary participants will be rewarded with valuable prizes. Join us and prove that following the rules pays off!',
        1, 'https://drive.google.com/uc?export=view&id=1fWHt7OH_Px0cfnqsypwjDOcTcDqT88bH', 0, 'AVAILABLE', 3),
       ('Remote access master',
        'Unlock your vehicle''s full potential with the Master of Remote Access challenge through Škoda Connect! Learn to maximize comfort, safety, and efficiency by controlling your car remotely, checking its status, and planning maintenance via the app. Stay informed about your drive and simplify daily driving with modern technology. Those who master all Škoda Connect features will be rewarded as true remote access experts. Join us and become a tech pioneer on the road!',
        1, 'https://drive.google.com/uc?export=view&id=1dIu9Lc0ckdWLOdSdTJt7ogu6VRpJKhRE', 0, 'AVAILABLE', 1),
       ('Observing a Safe Distance',
        'Improve road safety with our "Maintain Your Distance" challenge! Join this initiative to promote responsible driving by keeping a safe distance from other vehicles. Monitor and maintain the optimal distance throughout the month, considering speeds and weather. Share experiences, get expert advice, and learn techniques to stay calm and aware while driving. At the end, top drivers in road safety will be rewarded with prizes. Join us and show that responsible driving is possible!',
        1, 'https://drive.google.com/uc?export=view&id=1GagbHeXqq0CJS8EimwPOPwEi0pbCEs2l', 0, 'AVAILABLE', 2),
       ('Škoda Loyalty',
        'Join the Škoda Loyalty Drive Challenge and be rewarded for your loyalty! Subscribe to Škoda services for a year and unlock special rewards. Gain access to premium features, driving tips, and contests. Complete challenges, track progress, and earn points to win prizes that enhance your Škoda experience. Stay loyal and enjoy the benefits!',
        1, 'https://drive.google.com/uc?export=view&id=1Rn6C7Yad5sUrz17kltMxSGJdn5fAjgU6', 0, 'AVAILABLE', 3);