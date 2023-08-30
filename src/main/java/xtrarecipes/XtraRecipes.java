package xtrarecipes;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
/* 
import necesse.engine.commands.CommandsManager;
import necesse.engine.registries.*;
import necesse.gfx.gameTexture.GameTexture;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.level.maps.biomes.Biome;
*/

@ModEntry
public class XtraRecipes {

    public void init() {
        System.out.println("Hello from Xtra Recipes! V1.1");
        System.out.println("There was a typo from previous version, sorry!");
    }

    public void postInit() {
        // Note: Result comes before the recipe

        // ## "NONE" REGISTERS ##
        // throwable trashes
        Recipes.registerModRecipe(new Recipe("ninjastar", 10, RecipeTechRegistry.NONE, new Ingredient[] 
        {new Ingredient("ironbar", 1)}, true).showAfter("voidbullet"));
        Recipes.registerModRecipe(new Recipe("icejavelin", 5, RecipeTechRegistry.NONE, new Ingredient[] 
        {new Ingredient("frostshard", 1)}, true).showAfter("ninjastar"));
        // bombs
        Recipes.registerModRecipe(new Recipe("ironbomb", 1, RecipeTechRegistry.NONE, new Ingredient[]
        {new Ingredient("ironbar", 2), new Ingredient("anysapling", 1)}, false).showAfter("woodboat"));
        Recipes.registerModRecipe(new Recipe("dynamitestick", 1, RecipeTechRegistry.NONE, new Ingredient[] 
        {new Ingredient("ironbomb", 3)}, false).showAfter("ironbomb"));

        // scrolls
        Recipes.registerModRecipe(new Recipe("recallscroll", 1, RecipeTechRegistry.NONE, new Ingredient[] 
        {new Ingredient("mapfragment", 2), new Ingredient("coin", 50)}, true).showAfter("dungeonmap"));
        Recipes.registerModRecipe(new Recipe("travelscroll", 1, RecipeTechRegistry.NONE, new Ingredient[] 
        {new Ingredient("mapfragment", 2), new Ingredient("recallscroll", 1)}, true).showAfter("recallscroll"));

        // ## ALCHEMY REGISTERS ##
        // stinky bottle
        Recipes.registerModRecipe(new Recipe("stinkflask", 1, RecipeTechRegistry.ALCHEMY, new Ingredient[] 
        {new Ingredient("swampsludge", 5), new Ingredient("tuna", 1), 
        new Ingredient("swamplarva", 5), new Ingredient("glassbottle", 1)}, false));

        // ## ANVIL REGISTER ##
        // weapons, price cut down for making them worth crafting
        Recipes.registerModRecipe(new Recipe("copperpitchfork", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("copperbar", 18), new Ingredient("anylog", 2)}, false).showAfter("copperspear"));
        Recipes.registerModRecipe(new Recipe("handgun", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("brokenirontool", 2), new Ingredient("ironbar", 12)}, false));
        Recipes.registerModRecipe(new Recipe("machinegun", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("brokenirontool", 5), new Ingredient("ironbar", 20)}, false));
        Recipes.registerModRecipe(new Recipe("shotgun", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("brokenirontool", 6), new Ingredient("ironbar", 24)}, false));
        Recipes.registerModRecipe(new Recipe("sniperrifle", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("brokenirontool", 8), new Ingredient("ironbar", 27), new Ingredient("binoculars", 1)}, false));

        // fishing rods
        Recipes.registerModRecipe(new Recipe("ironfishingrod", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("ironbar", 12)}, false).showAfter("ironbow"));
        Recipes.registerModRecipe(new Recipe("goldfishingrod", 1, RecipeTechRegistry.IRON_ANVIL, new Ingredient[] 
        {new Ingredient("goldbar", 12)}, false).showAfter("goldgreatbow"));

        // ## WORKSTATION REGISTERS ##
        // rope. to leash animals. not hang yourself with.
        Recipes.registerModRecipe(new Recipe("rope", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("leather", 7)}, false).showAfter("spiderboots"));

        // rock tiles to stone, this belogns to the bottom.
        Recipes.registerModRecipe(new Recipe("stone", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("rocktile", 1)}, false));
        Recipes.registerModRecipe(new Recipe("snowstone", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("snowrocktile", 1)}, false));
        // Recipes.registerModRecipe(new Recipe("icetile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("snowtile", 2)}, false));

        // ice stuffs
        // showAfter seems to be broken. for now. use showBefore.
        Recipes.registerModRecipe(new Recipe("icewall", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("icetile", 5)}, false).showAfter("dungeonfloor"));
        Recipes.registerModRecipe(new Recipe("icedoor", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("icewall", 3)}, false).showBefore("icetile"));
        Recipes.registerModRecipe(new Recipe("icetile", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("deepicetile", 1)}, false).showBefore("swampstonewall"));

        // tools
        Recipes.registerModRecipe(new Recipe("binoculars", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("ironbar", 3), new Ingredient("glassbottle", 3)}, false).showAfter("luckycape"));

        // weapons
        Recipes.registerModRecipe(new Recipe("nunchucks", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("anylog", 10), new Ingredient("ironbar", 1)}, false).showAfter("woodspear"));
        Recipes.registerModRecipe(new Recipe("heavyhammer", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("anylog", 5), new Ingredient("anystone", 25)}, false).showAfter("woodboomerang"));
        Recipes.registerModRecipe(new Recipe("boxingglovegun", 1, RecipeTechRegistry.WORKSTATION, new Ingredient[]
        {new Ingredient("handgun", 1), new Ingredient("leatherglove", 1), new Ingredient("ironbar", 3)}, false).showAfter("heavyhammer"));

        // firework rockets
        Recipes.registerModRecipe(new Recipe("fireworkrocket", 10, RecipeTechRegistry.WORKSTATION, new Ingredient[] 
        {new Ingredient("dynamitestick", 1)}, false).showAfter("fireworkdispenser"));

        // ## DEMONIC WORKSTATION REGISTERS ##
        // pouches
        Recipes.registerModRecipe(new Recipe("ammopouch", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("leather", 14), new Ingredient("simplebullet", 500), new Ingredient("rope", 1)}, false).showAfter("luckycape"));
        Recipes.registerModRecipe(new Recipe("lunchbox", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("ammopouch", 1), new Ingredient("anylog", 25), new Ingredient("ironbar", 10)}, false).showAfter("ammopouch"));
        Recipes.registerModRecipe(new Recipe("potionpouch", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("healthpotion", 40), new Ingredient("ammopouch", 2)}, false).showAfter("lunchbox"));
        Recipes.registerModRecipe(new Recipe("voidpouch", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("leather", 14), new Ingredient("voidshard", 25), new Ingredient("rope", 1)}, false).showAfter("potionpouch"));

        // dungeon buildings
        Recipes.registerModRecipe(new Recipe("dungeonwall", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 8)}, false).showAfter("snowstonepathtile"));
        Recipes.registerModRecipe(new Recipe("dungeondoor", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 20)}, false).showAfter("dungeonwall"));
        Recipes.registerModRecipe(new Recipe("dungeonfloor", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 2)}, false).showAfter("dungeondoor"));
        Recipes.registerModRecipe(new Recipe("dungeonpressureplate", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 15), new Ingredient("wire", 5)}, false).showAfter("sandstonepressureplate"));

        // sand + snow biomes tile to stone
        Recipes.registerModRecipe(new Recipe("swampstone", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] {new Ingredient("swamprocktile", 1)}, false));
        Recipes.registerModRecipe(new Recipe("sandstone", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] {new Ingredient("sandstonetile", 1)}, false));

        // fishing rod
        // didn't find "anysapling" in the source code, wonder where it was registered..
        Recipes.registerModRecipe(new Recipe("overgrownfishingrod", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("anysapling", 1), new Ingredient("swampsludge", 8), new Ingredient("anylog", 10)}, false).showAfter("ivygreatbow"));

        // weapons
        Recipes.registerModRecipe(new Recipe("cutlass", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("ironbar", 20), new Ingredient("goldbar", 10), new Ingredient("coin", 500)}, false).showAfter("piratemap"));
        Recipes.registerModRecipe(new Recipe("genielamp", 1, RecipeTechRegistry.DEMONIC, new Ingredient[]
        {new Ingredient("goldbar", 10), new Ingredient("coin", 500)}, false).showAfter("cutlass"));
        Recipes.registerModRecipe(new Recipe("flintlock", 1, RecipeTechRegistry.DEMONIC, new Ingredient[]
        {new Ingredient("ironbar", 3), new Ingredient("brokenirontool", 2), new Ingredient("anylog", 5), 
        new Ingredient("coin", 500)}, false).showAfter("genielamp"));
        Recipes.registerModRecipe(new Recipe("lightninghammer", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("voidshard", 10), new Ingredient("demonicbar", 5)}, false).showAfter("voidgreatbow"));
        Recipes.registerModRecipe(new Recipe("voidstaff", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("voidshard", 4), new Ingredient("demonicbar", 8)}, false).showAfter("lightninghammer"));
        Recipes.registerModRecipe(new Recipe("voidmissile", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("voidstaff", 1), new Ingredient("voidshard", 8)}, false).showAfter("voidstaff"));
        Recipes.registerModRecipe(new Recipe("swamptome", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("book", 1), new Ingredient("swampsludge", 12)}, false).showAfter("ivyboots"));

        // recipebook
        // yet, another overpriced items from minecraft villager looking-buttface
         Recipes.registerModRecipe(new Recipe("recipebook", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("craftingguide", 1), new Ingredient("book", 5), new Ingredient("leather",5)}, false).showAfter("craftingguide"));

        // traps
        // void traps
        Recipes.registerModRecipe(new Recipe("dungeonvoidtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 5), new Ingredient("voidstaff", 1), new Ingredient("wire", 5)}, false));

        // flame traps
        // "lavatile" = lava bucket .. oh. it makes sense now.
        Recipes.registerModRecipe(new Recipe("stoneflametrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("stone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("sandstoneflametrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("sandstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("swampstoneflametrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("swampstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonflametrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("deepstone", 10), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false));

        // arrow traps
        Recipes.registerModRecipe(new Recipe("woodarrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("anylog", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("stonearrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("stone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("sandstonearrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("sandstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("swampstonearrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("swampstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("snowstonearrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("snowstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        Recipes.registerModRecipe(new Recipe("icearrowtrap", 1, RecipeTechRegistry.DEMONIC, new Ingredient[] 
        {new Ingredient("icewall", 1), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false));
        
        
        // ## ADVANCED WORKSTATION REGISTERS ##
        // coinporch
        Recipes.registerModRecipe(new Recipe("coinpouch", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("leather", 14), new Ingredient("coin", 450), new Ingredient("rope", 1)}, false).showAfter("voidpouch"));

        // deep tiles 2 deep stones
        Recipes.registerModRecipe(new Recipe("deepstone", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deeprocktile", 1)}, false).showAfter("sandstone"));
        Recipes.registerModRecipe(new Recipe("deepsnowstone", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsnowrocktile", 1)}, false).showAfter("deepstone"));
        Recipes.registerModRecipe(new Recipe("deepsandstone", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsandstonetile", 1)}, false).showAfter("deepsnowstone"));
        Recipes.registerModRecipe(new Recipe("deepswampstone", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepswamprocktile", 1)}, false).showAfter("deepsandstone"));

        // deep material traps
        // flame
        Recipes.registerModRecipe(new Recipe("deepstoneflametrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false).showAfter("dungeonflametrap"));
        Recipes.registerModRecipe(new Recipe("obsidianflametrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("obsidian", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false).showAfter("deepstoneflametrap"));
        Recipes.registerModRecipe(new Recipe("deepsnowstoneflametrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsnowstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false).showAfter("obsidianflametrap"));
        Recipes.registerModRecipe(new Recipe("deepswampstoneflametrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepswampstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false).showAfter("deepsnowstoneflametrap"));
        Recipes.registerModRecipe(new Recipe("deepsandstoneflametrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsandstone", 5), new Ingredient("lavatile", 1), new Ingredient("wire", 5)}, false).showAfter("deepswampstoneflametrap"));

        // arrow
        Recipes.registerModRecipe(new Recipe("dungeonarrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepstone", 10), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("icearrowtrap"));
        Recipes.registerModRecipe(new Recipe("deepstonearrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("dungeonarrowtrap"));
        Recipes.registerModRecipe(new Recipe("obsidianarrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("obsidian", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("deepstonearrowtrap"));
        Recipes.registerModRecipe(new Recipe("deepsnowstonearrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsnowstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("obsidianarrowtrap"));
        Recipes.registerModRecipe(new Recipe("deepswampstonearrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepswampstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("deepsnowstonearrowtrap"));
        Recipes.registerModRecipe(new Recipe("deepsandstonearrowtrap", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("deepsandstone", 5), new Ingredient("ironarrow", 30), new Ingredient("wire", 5)}, false).showAfter("deepswampstonearrowtrap"));

        // tools
        Recipes.registerModRecipe(new Recipe("infiniterope", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("rope", 4), new Ingredient("voidshard", 5)}, false).showAfter("rope"));
        Recipes.registerModRecipe(new Recipe("infinitewaterbucket", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("watertile", 5), new Ingredient("voidshard", 3)}, false).showAfter("infiniterope"));

        // weapons
        Recipes.registerModRecipe(new Recipe("slimecanister", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("bucket", 1), new Ingredient("swampsludge", 18), new Ingredient("lifeelixir", 2)}, false).showAfter("swamptome"));
        Recipes.registerModRecipe(new Recipe("elderlywand", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("woodstaff", 15), new Ingredient("anylog", 75)}, false).showAfter("woodstaff"));

        // ninja armors
        Recipes.registerModRecipe(new Recipe("ninjahood", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("wool", 12), new Ingredient("batwing", 6)}, false).showAfter("shadowboots"));
        Recipes.registerModRecipe(new Recipe("ninjarobe", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("wool", 16), new Ingredient("batwing", 9)}, false).showAfter("ninjahood"));
        Recipes.registerModRecipe(new Recipe("ninjashoes", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("wool", 10), new Ingredient("batwing", 3)}, false).showAfter("ninjarobe"));

        // flasks
        // unlike alchemy. we have to put them in advanced section for balancing.
        Recipes.registerModRecipe(new Recipe("recallflask", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("glassbottle", 1), new Ingredient("recallscroll", 15), new Ingredient("speedpotion", 2)}, false).showAfter("mysteriousportal"));
        Recipes.registerModRecipe(new Recipe("portalflask", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("recallflask", 1), new Ingredient("travelscroll", 8)}, false).showAfter("recallflask"));

        // sold by merchants
        Recipes.registerModRecipe(new Recipe("handcannon", 1, RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] 
        {new Ingredient("ironbar", 30), new Ingredient("tungstenbar", 10)}, false).showAfter("flintlock"));

        // ## FALLEN WORKSTATION REGISTER ##
        // they are now crafted by.. essences. swag.
        // antique weapons
        Recipes.registerModRecipe(new Recipe("antiquesword", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("primordialessence", 20)}, false).showAfter("antiquerifle"));
        Recipes.registerModRecipe(new Recipe("antiquebow", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("primordialessence", 20)}, false).showAfter("antiquesword"));

        // void bags
        Recipes.registerModRecipe(new Recipe("voidbag", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("voidpouch", 1), new Ingredient("shadowessence", 5), new Ingredient("cryoessence", 5), 
        new Ingredient("bioessence", 5), new Ingredient("primordialessence", 5)}, false).showAfter("ammobag"));

        // crypt stuffs
        // not sure whether necesse devs will add them officially. but eh. it's not hurting to add them.
        Recipes.registerModRecipe(new Recipe("cryptfencegate", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("cryptstone", 4), new Ingredient("anylog", 2)}, false));
        Recipes.registerModRecipe(new Recipe("cryptfence", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("cryptstone", 4)}, false));
        Recipes.registerModRecipe(new Recipe("cryptwall", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("cryptstone", 5)}, false));
        Recipes.registerModRecipe(new Recipe("cryptdoor", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("cryptstone", 15)}, false));
        Recipes.registerModRecipe(new Recipe("cryptpath", 1, RecipeTechRegistry.FALLEN_WORKSTATION, new Ingredient[] 
        {new Ingredient("cryptstone", 2)}, false));


        // ## CARPENTER REGISTERS ##
        // music player.. overpriced. yeah, take that merchant!
        Recipes.registerModRecipe(new Recipe("musicplayer", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("coin", 500), new Ingredient("goldbar", 20), new Ingredient("anylog", 10)}, false).showAfter("goldlamp"));

        // crypt column
        Recipes.registerModRecipe(new Recipe("cryptcolumn", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("cryptstone", 20)}, false).showAfter("deepsandstonecolumn"));

        // gold furnitures
        Recipes.registerModRecipe(new Recipe("golddinnertable", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("goldbar", 16)}, false));
        Recipes.registerModRecipe(new Recipe("goldchair", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("goldbar", 4)}, false));

        // dungeon furnitures
        Recipes.registerModRecipe(new Recipe("dungeonchest", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 16)}, false));
        Recipes.registerModRecipe(new Recipe("dungeondinnertable", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 32)}, false));
        Recipes.registerModRecipe(new Recipe("dungeondesk", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 16)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonmodulartable", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 16)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonchair", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 8)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonbench", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 20)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonbookshelf", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 20)}, false));
        Recipes.registerModRecipe(new Recipe("dungeoncabinet", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 20)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonbed", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("deepstone", 20), new Ingredient("wool", 10)}, false));
        Recipes.registerModRecipe(new Recipe("dungeondresser", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 16)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonclock", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("deepstone", 16), new Ingredient("ironbar",2)}, false));
        Recipes.registerModRecipe(new Recipe("dungeoncandelabra", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] 
        {new Ingredient("deepstone", 12), new Ingredient("torch", 3)}, false));
        Recipes.registerModRecipe(new Recipe("dungeondisplay", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 20)}, false));
        Recipes.registerModRecipe(new Recipe("dungeonbathtub", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 24)}, false));
        Recipes.registerModRecipe(new Recipe("dungeontoilet", 1, RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone", 12)}, false));
        
    }

}
