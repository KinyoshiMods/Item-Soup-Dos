package net.minecraft.src;

public class mod_ItemSoupDos extends BaseMod
{
    @MLProp
    public static int soupbowl = 12;


    public String getVersion()
    {
        return "MineCraft1.5.1__ItemSoupDos1.5.1r1";
    }

    public void load()
    {
        for (int var1 = 0; var1 < Item.itemsList.length; ++var1)
        {
            Item var2 = Item.itemsList[var1];

            if (var2 instanceof ItemSoup)
            {
                var2.maxStackSize = soupbowl;
            }
            else
            {
            }
        }
    }
}
