package isp;

public interface PrintScanContent {
    boolean printContent(String content);
    boolean scanContent(String content);
    boolean photoCopyContent(String content);
}

interface FaxContent
{
    boolean faxContent(String content);
}

interface PrintDuplex
{
    boolean printDuplexContent(String content);
}
class CannonMG2470 implements  PrintScanContent{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }
}

class HPLaserJet implements PrintScanContent, FaxContent, PrintDuplex{
    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        return false;
    }

    @Override
    public boolean printDuplexContent(String content) {
        return false;
    }
}