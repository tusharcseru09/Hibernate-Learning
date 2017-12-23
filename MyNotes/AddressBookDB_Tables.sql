create table Gender(    Gender_id serial primary key,    Gender_name varchar(25) not null    );insert into Gender(Gender_name) values('Male');insert into Gender(Gender_name) values('Female');insert into Gender(Gender_name) values('Refused');insert into Gender(Gender_name) values('Not known');insert into Gender(Gender_name) values('Transgender M/F');insert into Gender(Gender_name) values('Transgender F/M');create table Users(	User_Id serial primary key,	User_Username varchar(50) not null,	User_Fname varchar(90) not null,	User_Lname varchar(90) not null,	User_Job_Title varchar(25),	User_Email varchar(255) ,	User_Gender_Id int not null);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('abu.siddique','Md','Abu Bakkar Siddique','Software Engineer','abu.siddique@bjitgroup.com',1);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('tushar.islam','Md','Tushar Islam','Software Engineer','abu.siddique@valmetpartners.com',1);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('margaret.sharvin','Margaret','Sharvin','Not displayed in UI','margaret@partnersinadvocacy.org.uk',1);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('linda.bailey','Linda','Bailey','Glasgow Manager','linda@partnersinadvocacy.org.uk',2);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('stuart.wardall','Stuart','Wardall','Senior Advocacy Worker','stuart@partnersinadvocacy.org.uk',2);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('donna.nicholas','Donna','Nicholas','Advocacy Worker','donna.nicholas@partnersinadvocacy.org.uk',2);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('ayesha.akter','Ayesha','Akter','Worker at FWV','ayesha.akter@fwv.com',1);insert into Users(User_Username,User_Fname,User_Lname,User_Job_Title,User_Email,User_Gender_Id) values('thamid.islam','Thamid','Islam','Student','thamid.islam@sths.com',1);select U.User_Id , U.User_Username , U.User_Email, U.User_Gender_Id, G.Gender_id, G.Gender_name from users U , gender G where U.User_Gender_Id = G.Gender_Id order by U.User_Id;create table Phone_Number(	Phone_Id serial primary key,	User_Id int not null,	Mobile_no varchar(90) not null	);insert into Phone_Number(User_Id,Mobile_no) values(1,'+8801676784124');insert into Phone_Number(User_Id,Mobile_no) values(1,'+8801721380923');insert into Phone_Number(User_Id,Mobile_no) values(1,'+8801735019863');insert into Phone_Number(User_Id,Mobile_no) values(2,'+8801720356111');insert into Phone_Number(User_Id,Mobile_no) values(2,'+8801779136498');insert into Phone_Number(User_Id,Mobile_no) values(3,'+8801750758089');insert into Phone_Number(User_Id,Mobile_no) values(7,'+8801676784125');insert into Phone_Number(User_Id,Mobile_no) values(7,'+8801676784126');insert into Phone_Number(User_Id,Mobile_no) values(8,'+8801676784135');insert into Phone_Number(User_Id,Mobile_no) values(8,'+8801676784136');insert into Phone_Number(User_Id,Mobile_no) values(4,'+8801676784144');insert into Phone_Number(User_Id,Mobile_no) values(5,'+8801676784155');insert into Phone_Number(User_Id,Mobile_no) values(6,'+8801676784166');select U.User_Id , U.User_Username , U.User_Email, P.Mobile_no, (select gender_name from gender where gender_id = U.user_gender_id) as User_Genderfrom Users U, Phone_Number Pwhere U.user_id = P.user_idorder by U.User_Id  ;USER -1*> REL_GROUP -1*> GROUP_PEOPLEREL_GROUP(GROUP_CODE,GROUP_CREATOR[USER_ID],GROUP_DESCRIPTION)GROUP_PEOPLE(GROUP_CODE,GROUP_USERS[USER_ID], NOTES)create table REL_GROUP(    GROUP_CODE serial not null,    GROUP_CREATOR int not null,     GROUP_DESCRIPTION varchar(100) not null,    );select * from users;insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(1,'Family');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(1,'Friends');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(2,'Family');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(2,'Friends');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(7,'Family');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(7,'Friends');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(8,'Family');insert into REL_GROUP(GROUP_CREATOR,GROUP_DESCRIPTION) values(8,'Friends');select * from REL_GROUP;create table GROUP_PEOPLE(    GROUP_CODE int not null,    GROUP_USERS int not null,     NOTES varchar(500));insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(1,7,'boro apu');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(1,8,'Thamid');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(1,2,'my clone');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(2,3,'others 3');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(2,4,'others 4');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(2,5,'others 5');    insert into GROUP_PEOPLE(GROUP_CODE,GROUP_USERS,NOTES) values(2,6,'others 6');    SELECT U.User_Username, RG.GROUP_DESCRIPTION, GP.NOTES , (select ur.user_username from users ur where ur.user_id= GP.GROUP_USERS) as username FROM USERS U,REL_GROUP RG, GROUP_PEOPLE GPWHERE U.USER_ID=RG.GROUP_CREATOR AND RG.GROUP_CODE=GP.GROUP_CODE; 