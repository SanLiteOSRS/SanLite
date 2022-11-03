import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -418313575
	)
	int field3361;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	MusicPatchNode2 field3374;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1436504421
	)
	int field3359;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1238341101
	)
	int field3364;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 628479801
	)
	int field3365;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 346269159
	)
	int field3366;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1444674333
	)
	int field3376;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 493756683
	)
	int field3368;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 235445623
	)
	int field3369;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1651138161
	)
	int field3370;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1831826789
	)
	int field3379;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -876355289
	)
	int field3372;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 527741503
	)
	int field3373;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1455771942
	)
	int field3371;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1608541685
	)
	int field3375;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 630481895
	)
	int field3363;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1573620375
	)
	int field3378;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -231646461
	)
	int field3362;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method5670() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3374 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "254948321"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 8661
		Client.isMenuOpen = false; // L: 8662
		Client.menuActions[0] = "Cancel"; // L: 8664
		Client.menuTargets[0] = ""; // L: 8665
		Client.menuOpcodes[0] = 1006; // L: 8666
		Client.menuShiftClick[0] = false; // L: 8667
		Client.menuOptionsCount = 1; // L: 8668
	} // L: 8669

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1716775323"
	)
	static void method5669(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12703
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12704
		} else {
			byte[] var2 = new byte[24]; // L: 12709

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12711
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 12712

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 12713 12714 12715
				}

				if (var3 >= 24) { // L: 12717
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 12720
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 12725
		}
	} // L: 12705 12726
}
