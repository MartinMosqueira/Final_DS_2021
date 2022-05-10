package model;

public class FacadeCashier {
    private Authentication authentication;
    private Cashier cashier;
    private Account account;

    public FacadeCashier() {
        this.authentication = new Authentication();
        this.cashier = new Cashier();
        this.account = null;
    }

    public void enter_credentials(){
        boolean card_correct = this.authentication.read_card();

        if(card_correct){

            String key = this.authentication.enter_key();

            boolean password_correct = this.authentication.check_key(key);

            if(password_correct){

                this.account = this.authentication.get_account();

                return;

            }

        }

        authentication.fail();
    }

    public void extract_money(){
        if(this.account != null){

            int quantity = this.cashier.enter_quantity();

            boolean has_binance = this.cashier.has_binance(quantity);

            if(has_binance){

                boolean sufficient_balance = ((int)this.account.check_balance_available()) >= quantity;

                if(sufficient_balance){

                    this.account.block_account();

                    this.account.extract_balance(quantity);

                    this.account.update_account();

                    this.account.unlock_account();

                    this.cashier.send_money();

                    System.out.println(this.cashier.print_ticket());

                }

                else{

                    this.account.fail();

                }

            }

        }
    }
}
