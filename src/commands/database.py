from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

SQL_ALCHEMY_URI = f"postgresql://{os.getenv('WL24_BOT_DB_USER')}:{os.getenv('WL24_BOT_PASSWORD')}@postgres/{os.getenv('WL24_BOT_DATABASE')}"

engine = create_engine(
    SQL_ALCHEMY_URI
)

Session = sessionmaker()
Session.configure(bind=engine)

session = Session()

Base = declarative_base()
