import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
public class class305 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	static AbstractArchive field3396;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	static AbstractArchive field3404;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	static AbstractArchive field3399;
	@ObfuscatedName("aw")
	public static ArrayList field3395;
	@ObfuscatedName("ay")
	public static LinkedList field3392;
	@ObfuscatedName("ap")
	public static ArrayList field3397;
	@ObfuscatedName("av")
	public static ArrayList field3398;
	@ObfuscatedName("an")
	public static ArrayList field3393;
	@ObfuscatedName("au")
	public static final List field3394;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -904219559
	)
	public static int field3401;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 722513739
	)
	public static int field3400;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 46101293
	)
	public static int field3403;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 736142619
	)
	public static int field3402;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static ClanSettings field3406;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static Bounds field3405;

	static {
		field3395 = null; // L: 13
		field3392 = new LinkedList(); // L: 14
		field3397 = new ArrayList(3); // L: 15
		field3398 = new ArrayList(3); // L: 16
		field3393 = new ArrayList(); // L: 17
		field3394 = new ArrayList(); // L: 18
		field3401 = 0; // L: 19
		field3400 = 0; // L: 20
		field3403 = 0; // L: 21
		field3402 = 0; // L: 22
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-1752946221"
	)
	static int method5824(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5082
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5083
			ObjectComposition var4 = Language.getObjectDefinition(var3); // L: 5084
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5085
			return 1; // L: 5086
		} else {
			return 2; // L: 5088
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIB)V",
		garbageValue = "3"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11937
			if (var0 != null && ScriptEvent.method2318(var0) != null) { // L: 11938
				Client.clickedWidget = var0; // L: 11939
				Client.clickedWidgetParent = ScriptEvent.method2318(var0); // L: 11940
				Client.widgetClickX = var1; // L: 11941
				Client.widgetClickY = var2; // L: 11942
				MusicPatchPcmStream.widgetDragDuration = 0; // L: 11943
				Client.isDraggingWidget = false; // L: 11944
				int var3 = Client.menuOptionsCount - 1; // L: 11947
				if (var3 != -1) { // L: 11950
					class454.method8293(var3);
				}

			}
		}
	} // L: 11951
}
