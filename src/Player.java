public class Player {
    int number=0;//здесь хранится вриант числа
    public void  guess(){
        number = (int)(Math.random()*10);
        System.out.println("Думаю, что число "+ number);
    }
}
