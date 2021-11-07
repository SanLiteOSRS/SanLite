import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("n")
	public static boolean field3049;
	@ObfuscatedName("z")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -830177389
	)
	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 855382617
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -918896741
	)
	@Export("type")
	public int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1801435393
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1660525629
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 284180189
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -107040825
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2054031979
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1765529153
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -716032615
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -84019821
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -966786115
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -727779257
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -836435373
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 470259933
	)
	@Export("y")
	public int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1492995549
	)
	@Export("width")
	public int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1623576255
	)
	@Export("height")
	public int height;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1759853159
	)
	public int field3068;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -9428879
	)
	public int field3069;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 528333103
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ab")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 168917907
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1094545789
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1040080419
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1297742855
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1557539219
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 37220023
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1939141949
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -664309699
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("af")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("fillMode")
	public class411 fillMode;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1200768777
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1147011099
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1035105757
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bg")
	public boolean field3085;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 338387711
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1784284609
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1886200049
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bt")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 460210347
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -940365255
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bh")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bw")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1682155053
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1325924463
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1907857883
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -294218779
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 995334035
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 359756345
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1329362105
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1310924187
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1082654603
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2109691849
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -383796933
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -588937837
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 368452663
	)
	public int field3106;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 168328461
	)
	public int field3165;
	@ObfuscatedName("by")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("ba")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 57057327
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 928434151
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cq")
	@Export("text")
	public String text;
	@ObfuscatedName("ck")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 150906213
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1685073913
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -556962931
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ct")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1531986129
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 176722309
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cl")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cs")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ce")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cp")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1837183897
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("cw")
	public boolean field3125;
	@ObfuscatedName("cr")
	public byte[][] field3180;
	@ObfuscatedName("cu")
	public byte[][] field3105;
	@ObfuscatedName("cc")
	public int[] field3128;
	@ObfuscatedName("ch")
	public int[] field3129;
	@ObfuscatedName("co")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cy")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1233976297
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1376334067
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("da")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dw")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dn")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dc")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("du")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("db")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dp")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dj")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dt")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dy")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ds")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("de")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("di")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("do")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dr")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dz")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dd")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dl")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dm")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dk")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dv")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ed")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ej")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eu")
	public Object[] field3161;
	@ObfuscatedName("eh")
	public Object[] field3162;
	@ObfuscatedName("ec")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ek")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ea")
	public Object[] field3056;
	@ObfuscatedName("em")
	public Object[] field3166;
	@ObfuscatedName("ep")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("el")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ex")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ew")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("er")
	public Object[] field3172;
	@ObfuscatedName("eg")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ez")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -712270533
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ev")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ee")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ey")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ei")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1000336005
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -119048843
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1683480099
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -1549295787
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fa")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fi")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 500124989
	)
	public int field3188;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -898435809
	)
	public int field3189;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -242702175
	)
	public int field3073;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -592278881
	)
	public int field3191;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1719884029
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 11938569
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fn")
	public int[] field3194;
	@ObfuscatedName("ft")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fl")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fe")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field3049 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field3068 = 1;
		this.field3069 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class411.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3085 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3106 = 0;
		this.field3165 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.paddingX = 0;
		this.paddingY = 0;
		this.flags = 0;
		this.field3125 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.spellName = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.containsMouse = false;
		this.isClicked = false;
		this.field3188 = -1;
		this.field3189 = 0;
		this.field3073 = 0;
		this.field3191 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1471945401"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		int var5;
		int var6;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 2) {
			this.itemIds = new int[this.rawWidth * this.rawHeight];
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte();
			this.paddingY = var1.readUnsignedByte();
			this.inventoryXOffsets = new int[20];
			this.inventoryYOffsets = new int[20];
			this.inventorySprites = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var11 = var1.readUnsignedByte();
				if (var11 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.itemActions = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var9 = var1.readStringCp1252NullTerminated();
				if (var9.length() > 0) {
					this.itemActions[var8] = var9;
					this.flags |= 1 << var8 + 23;
				}
			}
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 7) {
			this.itemIds = new int[this.rawHeight * this.rawWidth];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			this.textXAlignment = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
			this.paddingX = var1.readShort();
			this.paddingY = var1.readShort();
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.flags |= 1073741824;
			}

			this.itemActions = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var5] = var10;
					this.flags |= 1 << var5 + 23;
				}
			}
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2 || this.type == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.spellName = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1242431249"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field3106 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field3085 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)[Ljava/lang/Object;",
		garbageValue = "-866877812"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)[I",
		garbageValue = "105"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "657208411"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZB)Low;",
		garbageValue = "-58"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field3049 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapScaleHandler.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field3049 = true;
					return null;
				} else {
					if (this.spriteFlipV) {
						var5.flipVertically();
					}

					if (this.spriteFlipH) {
						var5.flipHorizontally();
					}

					if (this.outline > 0) {
						var5.pad(this.outline);
					}

					if (this.outline >= 1) {
						var5.outline(1);
					}

					if (this.outline >= 2) {
						var5.outline(16777215);
					}

					if (this.spriteShadow != 0) {
						var5.shadow(this.spriteShadow);
					}

					Widget_cachedSprites.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lle;",
		garbageValue = "96"
	)
	@Export("getFont")
	public Font getFont() {
		field3049 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = WorldMapScaleHandler.Widget_spritesArchive;
				AbstractArchive var4 = class134.Widget_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!BuddyRankComparator.SpriteBuffer_loadSpritesFromArchive(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class414.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, UrlRequester.SpriteBuffer_spriteWidths, class414.SpriteBuffer_spriteHeights, HitSplatDefinition.SpriteBuffer_spritePalette, class295.SpriteBuffer_pixels);
						PacketBuffer.method6913();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3049 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Low;",
		garbageValue = "-1869717535"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3049 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = WorldMapSection0.SpriteBuffer_getSprite(WorldMapScaleHandler.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3049 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IZLit;I)Lhl;",
		garbageValue = "811469011"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3049 = false;
		int var5;
		int var6;
		if (var3) {
			var5 = this.modelType2;
			var6 = this.modelId2;
		} else {
			var5 = this.modelType;
			var6 = this.modelId;
		}

		if (var5 == 0) {
			return null;
		} else if (var5 == 1 && var6 == -1) {
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field3049 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = ScriptFrame.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field3049 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 3) {
					if (var4 == null) {
						return null;
					}

					var8 = var4.getModelData();
					if (var8 == null) {
						field3049 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = TaskHandler.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field3049 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZB)Liw;",
		garbageValue = "-56"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2;
		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40);
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1);
				if (var6 == null) {
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized();
					int[] var8 = new int[var7.subHeight];
					int[] var9 = new int[var7.subHeight];

					for (int var10 = 0; var10 < var7.subHeight; ++var10) {
						int var11 = 0;
						int var12 = var7.subWidth;

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var11 = var13;
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) {
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) {
								var12 = var13 + 1;
								break;
							}
						}

						var8[var10] = var11;
						var9[var10] = var12 - var11;
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2);
					Widget_cachedSpriteMasks.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "35"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}
}
