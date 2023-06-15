import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static final WorldMapID field3020;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static final WorldMapID field3022;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1911733203
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -993647619
	)
	@Export("value")
	final int value;

	static {
		field3020 = new WorldMapID(0); // L: 4
		field3022 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "1925460690"
	)
	static final void method5467(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10164
			if (Client.menuOptionsCount < 500) { // L: 10165
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10166
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10167
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10168
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10169
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10170
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10171
				Client.field655[Client.menuOptionsCount] = var6; // L: 10172
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10173
				++Client.menuOptionsCount; // L: 10174
			}

		}
	} // L: 10176
}
