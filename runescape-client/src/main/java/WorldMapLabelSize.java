import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ki")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("as")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = 1050383775
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 858742347
	)
	final int field2962;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1959176025
	)
	final int field2961;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1901919245
	)
	final int field2957;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2962 = var1; // L: 19
		this.field2961 = var2; // L: 20
		this.field2957 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1363746483"
	)
	boolean method5238(float var1) {
		return var1 >= (float)this.field2957; // L: 25
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lki;",
		garbageValue = "2089203985"
	)
	static WorldMapLabelSize[] method5242() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large}; // L: 15
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-851138978"
	)
	static int method5243(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1566
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1567
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.itemId; // L: 1568
			return 1; // L: 1569
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1571
			if (var3.itemId != -1) { // L: 1572
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 1573
			}

			return 1; // L: 1574
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1576
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1577
			return 1; // L: 1578
		} else if (var0 == 1707) { // L: 1580
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.method6697() ? 1 : 0; // L: 1581
			return 1; // L: 1582
		} else if (var0 == 1708) { // L: 1584
			return PcmPlayer.method752(var3); // L: 1585
		} else {
			return var0 == 1709 ? SpriteMask.method6247(var3) : 2; // L: 1587 1588 1590
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1812937310"
	)
	static void method5240(int var0) {
		class210.method3930(14); // L: 1993
		Login.field957 = var0; // L: 1994
	} // L: 1995

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IZZZZB)Lov;",
		garbageValue = "-75"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 1955
		if (JagexCache.JagexCache_dat2File != null) { // L: 1956
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator5.JagexCache_idxFiles[var0], 1000000); // L: 1957
		}

		return new Archive(var5, Decimator.field392, ChatChannel.field1023, var0, var1, var2, var3, var4, false); // L: 1959
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIILde;I)V",
		garbageValue = "1789818729"
	)
	static void method5246(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3824
			if (var0.field2373 != null && var0.field2373.containsKey(var1)) { // L: 3825
				class220 var5 = (class220)var0.field2373.get(var1); // L: 3826
				if (var5 != null) {
					int var6 = var5.field2241 & 31; // L: 3828
					if ((var6 <= 0 || NPC.clientPreferences.method2475() != 0) && (var6 != 0 || NPC.clientPreferences.method2473() != 0)) { // L: 3829
						class311.method5913(var5, var2, var3, var4 == class133.localPlayer); // L: 3830
					}
				}
			}
		}
	} // L: 3827 3831
}
