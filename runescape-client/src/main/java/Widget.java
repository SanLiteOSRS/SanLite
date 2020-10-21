import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "[[Lhq;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("f")
	public static boolean field2611;
	@ObfuscatedName("y")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1189552295
	)
	@Export("id")
	public int id;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1997993253
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -531389959
	)
	@Export("type")
	public int type;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -271172565
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -784599883
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -160427093
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1846560629
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 84465573
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1226090749
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2088624487
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1233836267
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1843073905
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1879271747
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1517732015
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 256308969
	)
	@Export("y")
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1613274363
	)
	@Export("width")
	public int width;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1991496335
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1488324875
	)
	public int field2622;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1765523627
	)
	public int field2623;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1948885583
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("al")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1183715667
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -699502093
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1556531767
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1626628049
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1201601061
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1272515191
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -5591483
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1367295317
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("aj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "Llm;"
	)
	@Export("fillMode")
	public class332 fillMode;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 955254737
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1148839493
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1328949873
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bl")
	public boolean field2639;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1969239081
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -250118287
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -237364125
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bh")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1634007559
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1037474535
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("br")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bp")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1324605985
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 734022747
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1986373533
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -651946363
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1530355915
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1814107681
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1684215659
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2011277719
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1767129155
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 21691605
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1295427891
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1679520267
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1534988333
	)
	public int field2728;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1067909943
	)
	public int field2633;
	@ObfuscatedName("bf")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("bt")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1750770011
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 228754721
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ca")
	@Export("text")
	public String text;
	@ObfuscatedName("ct")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 22170567
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 372737821
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 188319241
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cn")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1239558509
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 684939999
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cu")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("cw")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("cq")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("cc")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1387630371
	)
	@Export("clickMask")
	public int clickMask;
	@ObfuscatedName("cj")
	public boolean field2676;
	@ObfuscatedName("cd")
	public byte[][] field2626;
	@ObfuscatedName("cx")
	public byte[][] field2719;
	@ObfuscatedName("ck")
	public int[] field2682;
	@ObfuscatedName("co")
	public int[] field2683;
	@ObfuscatedName("dx")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dq")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1668184029
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1282838075
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("db")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dj")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dk")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("de")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("da")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("dr")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("dw")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("dy")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ds")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("dl")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("di")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("do")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("df")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("dm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("du")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("dc")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("dn")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("dz")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("dp")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("dt")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("dg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ee")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("en")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("eu")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eo")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("es")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ek")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("er")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ep")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("eg")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("eq")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("em")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("eh")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ec")
	public Object[] field2722;
	@ObfuscatedName("ej")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ez")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("eb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1041425319
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ef")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("ey")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("ew")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ex")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = -419140007
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -239895029
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -844392783
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -450327171
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "[Lhq;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fq")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fx")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1974330189
	)
	public int field2664;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 786737003
	)
	public int field2618;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 421837705
	)
	public int field2727;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1990354289
	)
	public int field2681;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -390238451
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 1135189541
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("fe")
	public int[] field2661;
	@ObfuscatedName("fb")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("fc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("fm")
	public boolean field2747;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		Widget_cachedModels = new EvictingDualNodeHashTable(50);
		Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		field2611 = false;
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
		this.field2622 = 1;
		this.field2623 = 1;
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
		this.fillMode = class332.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field2639 = false;
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
		this.field2728 = 0;
		this.field2633 = 0;
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
		this.field2676 = false;
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
		this.field2664 = -1;
		this.field2618 = 0;
		this.field2727 = 0;
		this.field2681 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.field2747 = false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Lkf;B)V",
		garbageValue = "-56"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "-1100284620"
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
				this.field2728 = var1.readUnsignedShort();
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
			this.field2639 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkf;I)[Ljava/lang/Object;",
		garbageValue = "1410086858"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Lkf;I)[I",
		garbageValue = "931068469"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1248652086"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ZB)Llp;",
		garbageValue = "-13"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1) {
		field2611 = false;
		int var2;
		if (var1) {
			var2 = this.spriteId;
		} else {
			var2 = this.spriteId2;
		}

		if (var2 == -1) {
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40);
			SpritePixels var5 = (SpritePixels)Widget_cachedSprites.get(var3);
			if (var5 != null) {
				return var5;
			} else {
				var5 = AbstractUserComparator.SpriteBuffer_getSprite(Messages.Widget_spritesArchive, var2, 0);
				if (var5 == null) {
					field2611 = true;
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Lkr;",
		garbageValue = "-5714739"
	)
	@Export("getFont")
	public Font getFont() {
		field2611 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = RouteStrategy.method3688(Messages.Widget_spritesArchive, HealthBar.Widget_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId);
				} else {
					field2611 = true;
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IB)Llp;",
		garbageValue = "45"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field2611 = false;
		if (var1 >= 0 && var1 < this.inventorySprites.length) {
			int var2 = this.inventorySprites[var1];
			if (var2 == -1) {
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2);
				if (var3 != null) {
					return var3;
				} else {
					var3 = AbstractUserComparator.SpriteBuffer_getSprite(Messages.Widget_spritesArchive, var2, 0);
					if (var3 != null) {
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field2611 = true;
					}

					return var3;
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Ljm;IZLha;I)Ler;",
		garbageValue = "-1710688056"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field2611 = false;
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
						field2611 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 2) {
					var8 = Skeleton.getNpcDefinition(var6).getModelData();
					if (var8 == null) {
						field2611 = true;
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
						field2611 = true;
						return null;
					}

					var7 = var8.toModel(64, 768, -50, -10, -50);
				}

				if (var5 == 4) {
					ItemComposition var9 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6);
					var8 = var9.getModelData(10);
					if (var8 == null) {
						field2611 = true;
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(ZI)Lhz;",
		garbageValue = "1282321676"
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
			long var3 = ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "-1337078024"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lln;ZI)V",
		garbageValue = "-846882241"
	)
	public static void method4173(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var8) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		Buffer var2;
		if (NetCache.NetCache_socket != null) {
			try {
				var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				NetCache.NetCache_socket.write(var2.array, 0, 4);
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var6) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		SceneTilePaint.NetCache_currentResponse = null;
		class224.NetCache_responseArchiveBuffer = null;
		NetCache.field3205 = 0;

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
			if (var9 == null) {
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
					if (var9 == null) {
						if (NetCache.field3208 != 0) {
							try {
								var2 = new Buffer(4);
								var2.writeByte(4);
								var2.writeByte(NetCache.field3208);
								var2.writeShort(0);
								NetCache.NetCache_socket.write(var2.array, 0, 4);
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var4) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_loadTime = 0;
						NetCache.field3195 = PacketWriter.currentTimeMillis();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9);
					NetCache.NetCache_pendingWrites.put(var9, var9.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Liw;IS)V",
		garbageValue = "1604"
	)
	static void method4174(Archive var0, int var1) {
		if (MenuAction.NetCache_reference != null) {
			MenuAction.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = MenuAction.NetCache_reference.readInt();
			int var3 = MenuAction.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			Varps.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "37"
	)
	public static boolean method4172(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "757638710"
	)
	static final void method4175(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuTargets[var0];
			SecureRandomCallable.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
