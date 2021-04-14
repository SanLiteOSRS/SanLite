import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "[[Lhu;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("q")
	public static boolean field2622;
	@ObfuscatedName("t")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 516202957
	)
	@Export("id")
	public int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1704710587
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 812287217
	)
	@Export("type")
	public int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 930394621
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2019337075
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 188435577
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1709656523
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 728571695
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -745936495
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -350194089
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 990647639
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -787516857
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1615336231
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -722762479
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1586546691
	)
	@Export("y")
	public int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1340111239
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -834307829
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -598841187
	)
	public int field2614;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -365488349
	)
	public int field2642;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1589172375
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("af")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1529220539
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1431413215
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1255368413
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -639002299
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1774033701
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1100945301
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1200561941
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -160089127
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ar")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "Lox;"
	)
	@Export("fillMode")
	public class392 fillMode;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1037045283
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1529069059
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -757656999
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bh")
	public boolean field2727;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1779540973
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 718176713
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -609319985
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1156505419
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2056543533
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ba")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("be")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1125239001
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1279491537
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1632912361
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1784046267
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1638579631
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -440155799
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1697744779
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1772660447
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 32750401
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1631404785
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -962772699
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1961993049
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1304752559
	)
	public int field2720;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -556877877
	)
	public int field2680;
	@ObfuscatedName("bu")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bl")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1625407889
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1150086731
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cf")
	@Export("text")
	public String text;
	@ObfuscatedName("co")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1148032829
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1334007947
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -283419665
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ce")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -624611843
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1918897871
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cn")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("ca")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("ch")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cq")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -960682031
	)
	@Export("clickMask")
	public int clickMask;
	@ObfuscatedName("cu")
	public boolean field2698;
	@ObfuscatedName("cb")
	public byte[][] field2699;
	@ObfuscatedName("cv")
	public byte[][] field2747;
	@ObfuscatedName("cj")
	public int[] field2701;
	@ObfuscatedName("cy")
	public int[] field2692;
	@ObfuscatedName("ci")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cm")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 2060963123
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1057442763
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dy")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dg")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dq")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dl")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dn")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("de")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("da")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dz")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dr")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dh")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("du")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("di")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dp")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("db")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ds")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dv")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("df")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dx")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dj")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dt")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dd")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("dw")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ec")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ek")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ei")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ep")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("et")
	public Object[] field2736;
	@ObfuscatedName("el")
	public Object[] field2655;
	@ObfuscatedName("eb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eg")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("em")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("eh")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ey")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("eu")
	public Object[] field2743;
	@ObfuscatedName("en")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ew")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -1860696897
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ef")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ev")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("er")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("es")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 830132731
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1175523821
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -972274073
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1021336893
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		signature = "[Lhu;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ea")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fi")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -149116897
	)
	public int field2759;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1251998105
	)
	public int field2760;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -1199991373
	)
	public int field2748;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 290924521
	)
	public int field2754;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = 738866907
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 11649141
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fv")
	public int[] field2653;
	@ObfuscatedName("fr")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fw")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fp")
	public boolean field2768;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field2622 = false;
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
		this.field2614 = 1;
		this.field2642 = 1;
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
		this.fillMode = class392.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field2727 = false;
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
		this.field2720 = 0;
		this.field2680 = 0;
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
		this.clickMask = 0;
		this.field2698 = false;
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
		this.field2759 = -1;
		this.field2760 = 0;
		this.field2748 = 0;
		this.field2754 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.field2768 = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "4"
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
			this.itemIds = new int[this.rawHeight * this.rawWidth];
			this.itemQuantities = new int[this.rawWidth * this.rawHeight];
			var4 = var1.readUnsignedByte();
			if (var4 == 1) {
				this.clickMask |= 268435456;
			}

			var5 = var1.readUnsignedByte();
			if (var5 == 1) {
				this.clickMask |= 1073741824;
			}

			var6 = var1.readUnsignedByte();
			if (var6 == 1) {
				this.clickMask |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte();
			if (var7 == 1) {
				this.clickMask |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte();
			this.paddingY = var1.readUnsignedByte();
			this.inventoryXOffsets = new int[20];
			this.inventoryYOffsets = new int[20];
			this.inventorySprites = new int[20];

			int var8;
			for (var8 = 0; var8 < 20; ++var8) {
				int var9 = var1.readUnsignedByte();
				if (var9 == 1) {
					this.inventoryXOffsets[var8] = var1.readShort();
					this.inventoryYOffsets[var8] = var1.readShort();
					this.inventorySprites[var8] = var1.readInt();
				} else {
					this.inventorySprites[var8] = -1;
				}
			}

			this.itemActions = new String[5];

			for (var8 = 0; var8 < 5; ++var8) {
				String var11 = var1.readStringCp1252NullTerminated();
				if (var11.length() > 0) {
					this.itemActions[var8] = var11;
					this.clickMask |= 1 << var8 + 23;
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
			this.itemIds = new int[this.rawWidth * this.rawHeight];
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
				this.clickMask |= 1073741824;
			}

			this.itemActions = new String[5];

			for (var5 = 0; var5 < 5; ++var5) {
				String var10 = var1.readStringCp1252NullTerminated();
				if (var10.length() > 0) {
					this.itemActions[var5] = var10;
					this.clickMask |= 1 << var5 + 23;
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
			this.clickMask |= var4 << 11;
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
			this.clickMask |= 4194304;
		}

		if (this.buttonType == 6) {
			this.clickMask |= 1;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "-47"
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
				this.field2720 = var1.readUnsignedShort();
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
			this.field2727 = var1.readUnsignedByte() == 1;
		}

		this.clickMask = var1.readMedium();
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lnu;I)[Ljava/lang/Object;",
		garbageValue = "1322277036"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lnu;B)[I",
		garbageValue = "-45"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "47"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(ZB)Loh;",
		garbageValue = "-10"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2622 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = ModelData0.SpriteBuffer_getSprite(UrlRequest.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field2622 = true;
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Lkq;",
		garbageValue = "1091608415"
	)
	@Export("getFont")
	public Font getFont() {
		field2622 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class236.method4378(UrlRequest.Widget_spritesArchive, class32.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field2622 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IB)Loh;",
		garbageValue = "0"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2622 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = ModelData0.SpriteBuffer_getSprite(UrlRequest.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2622 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lkw;IZLht;B)Lgv;",
		garbageValue = "-63"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2622 = false;
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
					var8 = ModelData.ModelData_get(WorldMapDecoration.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field2622 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = GraphicsObject.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field2622 = true;
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
						field2622 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = class23.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field2622 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast * 5 + 768, -50, -10, -50);
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ZI)Lhh;",
		garbageValue = "-791835766"
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
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "2040886071"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIB)Lcc;",
		garbageValue = "42"
	)
	static Script method4292(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = BuddyRankComparator.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = BuddyRankComparator.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = WorldMapIcon_1.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
