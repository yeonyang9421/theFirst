package wednesday;

public class DaoExample {

    public static   void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork((new MySqlDao()));
    }

    private static class OracleDao implements DataAccessObject {
        String name="Oracle";

        @Override
        public void select() {
            System.out.println(this.name + " DB에서 검색");
        }

        @Override
        public void update() {
            System.out.println(this.name + " DB에서 삽입");
        }

        @Override
        public void insert() {
            System.out.println(this.name + " DB에서 수정");
        }

        @Override
        public void delete() {
            System.out.println(this.name + " DB에서 삭제");

        }
    }

    private static class MySqlDao implements DataAccessObject {
        String name="MySqlDao";

        @Override
        public void select() {
            System.out.println(this.name + " DB에서 검색");
        }

        @Override
        public void update() {
            System.out.println(this.name + " DB에서 삽입");
        }

        @Override
        public void insert() {
            System.out.println(this.name + " DB에서 수정");
        }

        @Override
        public void delete() {
            System.out.println(this.name + " DB에서 삭제");
        }
    }
}
