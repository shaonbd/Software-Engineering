package pos;

import java.io.IOException;
import java.util.ArrayList;

public class SaleFactory {

    private static SaleFactory instance;
    private IVATCalculator vatCalculator;
    ArrayList<ProductSpecification> psList;

    public SaleFactory() {
        psList = new ArrayList<ProductSpecification>();

        ProductSpecification ps1 = new ProductSpecification();
        ps1.setId(1);
        ps1.setName("Book");
        ps1.setPrice(100);
        psList.add(ps1);

        ProductSpecification ps2 = new ProductSpecification();
        ps2.setId(2);
        ps2.setName("Biscuit");
        ps2.setPrice(30);
        psList.add(ps2);

        ProductSpecification ps3 = new ProductSpecification();
        ps3.setId(3);
        ps3.setName("Ice Cream");
        ps3.setPrice(60);
        psList.add(ps3);

        ProductSpecification ps4 = new ProductSpecification();
        ps4.setId(4);
        ps4.setName("Butter");
        ps4.setPrice(130);
        psList.add(ps4);

        ProductSpecification ps5 = new ProductSpecification();
        ps5.setId(5);
        ps5.setName("Pepsi");
        ps5.setPrice(20);
        psList.add(ps5);
    }

    public ProductSpecification getProductSpecification(int id) {

        ProductSpecification ps = null;

        for (int i = 0; i < psList.size(); i++) {
            if (psList.get(i).getId() == id) {
                ps = psList.get(i);
                break;
            }
        }

        return ps;
    }

    public static synchronized SaleFactory getInstance() {
        if (instance == null) {
            instance = new SaleFactory();
        }

        return instance;
    }

    public IVATCalculator getVatCalculator() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        if (vatCalculator == null) {
            Config config = new Config();
            String className = config.getProperties("vatcalculator.class.name");
            vatCalculator = (IVATCalculator) Class.forName(className).newInstance();
        }
        return vatCalculator;
    }
}
