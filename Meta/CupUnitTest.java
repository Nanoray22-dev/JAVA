package Meta;



public class CupUnitTest {
    private String liquidType;
    private double percentFull;

    
    public CupUnitTest(String string) {
    }
    public CupUnitTest(double d) {
    }
    public void Cup(String liquidType, double percentFull){
        this.liquidType = liquidType;
        this.percentFull = percentFull;

    }
    public String getLiquidType(){
        return liquidType;
    }

    public void setLiquidType(String liquidType){
        this.liquidType = liquidType;
    }

    public double getPercentFull(){
        return percentFull;
    }

    public void setPercentFull(Double percenFull){
        this.percentFull = percenFull;
    }


}
