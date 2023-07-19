import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 885542077
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -962979933
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -531805093
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lca;",
		garbageValue = "2077029307"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class16.World_worlds[++World.World_listCount - 1] : null; // L: 253 254
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1337787122"
	)
	static final int method5544(int var0, int var1) {
		int var2 = ClanChannelMember.method3228(var0 - 1, var1 - 1) + ClanChannelMember.method3228(1 + var0, var1 - 1) + ClanChannelMember.method3228(var0 - 1, var1 + 1) + ClanChannelMember.method3228(var0 + 1, 1 + var1); // L: 923
		int var3 = ClanChannelMember.method3228(var0 - 1, var1) + ClanChannelMember.method3228(var0 + 1, var1) + ClanChannelMember.method3228(var0, var1 - 1) + ClanChannelMember.method3228(var0, 1 + var1); // L: 924
		int var4 = ClanChannelMember.method3228(var0, var1); // L: 925
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 926
	}
}
