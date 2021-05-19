import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[[Liv;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	static EvictingDualNodeHashTable field3099;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("archive0")
	static EvictingDualNodeHashTable archive0;
	@ObfuscatedName("e")
	public static boolean field2962;
	@ObfuscatedName("d")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1657404511
	)
	@Export("id")
	public int id;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -698732553
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 64684553
	)
	@Export("type")
	public int type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 324979553
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2139248973
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 845784617
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1176520073
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121464481
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -417852981
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 89011749
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1136780367
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 665432073
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 507916453
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -404307857
	)
	@Export("x")
	public int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1382743151
	)
	@Export("y")
	public int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1078557001
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 761540169
	)
	@Export("height")
	public int height;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -403059855
	)
	public int field2981;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 702840379
	)
	public int field3104;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1280996229
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ay")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1488969087
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1276398639
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -734718787
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -58177491
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1099336735
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1999893025
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -206274595
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1740312057
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ab")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("fillMode")
	public class393 fillMode;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1774292449
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1067540577
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2036973785
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bd")
	public boolean field2998;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 228731547
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1015582433
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -855224077
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bb")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2028815797
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -321927459
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("by")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bz")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -668548519
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 522593307
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1494613609
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 55793881
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 568573455
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1193261339
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 722531995
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1703742235
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -159122815
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -252617511
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 888599943
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1110666581
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -851269017
	)
	public int field3019;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -255882845
	)
	public int field3020;
	@ObfuscatedName("bc")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bo")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1473651185
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 713454117
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ch")
	@Export("text")
	public String text;
	@ObfuscatedName("cu")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 666665849
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 703489487
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 200371273
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ck")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -605112505
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -223176707
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cf")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cq")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cs")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cd")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -201279953
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("co")
	public boolean field2985;
	@ObfuscatedName("cz")
	public byte[][] field3039;
	@ObfuscatedName("cl")
	public byte[][] field2987;
	@ObfuscatedName("cp")
	public int[] field3070;
	@ObfuscatedName("cr")
	public int[] field3090;
	@ObfuscatedName("cb")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("cv")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1548715729
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 106736357
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dj")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("du")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dw")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("dp")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("dl")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dd")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dz")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dh")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("dn")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dm")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("dq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("da")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("de")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dy")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("di")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dt")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("df")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dr")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dg")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dv")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dx")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("dk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("dc")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("db")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("el")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ec")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ei")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ek")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ee")
	public Object[] field3076;
	@ObfuscatedName("ea")
	public Object[] field2974;
	@ObfuscatedName("en")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ed")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("et")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ev")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("es")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ej")
	public Object[] field3004;
	@ObfuscatedName("ew")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("eq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eg")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 987883999
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ex")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ef")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("eh")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("eu")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 379748005
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1429348525
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 785848287
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -986770365
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("er")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fb")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 2000499449
	)
	public int field3015;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = 1600724097
	)
	public int field3100;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -2075433043
	)
	public int field3101;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -1259077203
	)
	public int field3049;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1662061379
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 359252081
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fo")
	public int[] field3105;
	@ObfuscatedName("fz")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fe")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fm")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedFonts = new EvictingDualNodeHashTable(200);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(50);
		field3099 = new EvictingDualNodeHashTable(20);
		archive0 = new EvictingDualNodeHashTable(8);
		field2962 = false;
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
		this.field2981 = 1;
		this.field3104 = 1;
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
		this.fillMode = class393.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field2998 = false;
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
		this.field3019 = 0;
		this.field3020 = 0;
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
		this.field2985 = false;
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
		this.field3015 = -1;
		this.field3100 = 0;
		this.field3101 = 0;
		this.field3049 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "106"
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
			this.itemQuantities = new int[this.rawHeight * this.rawWidth];
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "918444461"
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
				this.field3019 = var1.readUnsignedShort();
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
			this.field2998 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)[Ljava/lang/Object;",
		garbageValue = "-926814318"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)[I",
		garbageValue = "1740975257"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "435222986"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)Low;",
		garbageValue = "1342803906"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2962 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpritePixels var5 = (SpritePixels)Widget_cachedFonts.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = Friend.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field2962 = true;
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

					Widget_cachedFonts.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "912358255"
	)
	@Export("getFont")
	public Font getFont() {
		field2962 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)field3099.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = Widget_spritesArchive;
				AbstractArchive var4 = FileSystem.Widget_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Username.method5711(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels);
						class243.SpriteBuffer_xOffsets = null;
						class396.SpriteBuffer_yOffsets = null;
						ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
						class372.SpriteBuffer_spriteHeights = null;
						AccessFile.SpriteBuffer_spritePalette = null;
						class396.SpriteBuffer_pixels = null;
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					field3099.put(var2, (long)this.fontId);
				} else {
					field2962 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Low;",
		garbageValue = "18"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2962 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedFonts.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = Friend.SpriteBuffer_getSprite(Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedFonts.put(var3, (long)var2);
					} else {
						field2962 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfb;IZLii;B)Lgj;",
		garbageValue = "-34"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2962 = false;
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
			Model var7 = (Model)Widget_cachedSpriteMasks.get((long)(var6 + (var5 << 16)));
			if (var7 == null) {
				ModelData var8;
				if (var5 == 1) {
					var8 = ModelData.ModelData_get(class245.Widget_modelsArchive, var6, 0);
					if (var8 == null) {
						field2962 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = class8.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field2962 = true;
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
						field2962 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = Strings.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field2962 = true;
						return null;
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50);
				}

				Widget_cachedSpriteMasks.put(var7, (long)(var6 + (var5 << 16)));
			}

			if (var1 != null) {
				var7 = var1.transformWidgetModel(var7, var2);
			}

			return var7;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lil;",
		garbageValue = "1247885701"
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
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38);
			SpriteMask var5 = (SpriteMask)archive0.get(var3);
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
					archive0.put(var5, var3);
					return var5;
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-97817393"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZIZB)I",
		garbageValue = "1"
	)
	static int method4688(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ApproximateRouteStrategy.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = ApproximateRouteStrategy.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}
}
