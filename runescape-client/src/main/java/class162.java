import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class162 extends class143 {
	@ObfuscatedName("aa")
	static int[][] field1794;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	static Widget[] field1797;
	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 519523655
	)
	int field1799;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class162(class146 var1) {
		this.this$0 = var1;
		this.field1799 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1799 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3190(this.field1799); // L: 153
	} // L: 154

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILmc;ZI)V",
		garbageValue = "-1867605195"
	)
	static void method3296(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class227.getWorldMap().getMapArea(var0); // L: 5323
		int var4 = VarbitComposition.localPlayer.plane; // L: 5324
		int var5 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7); // L: 5325
		int var6 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7); // L: 5326
		Coord var7 = new Coord(var4, var5, var6); // L: 5327
		class227.getWorldMap().method8514(var3, var7, var1, var2); // L: 5328
	} // L: 5329
}
