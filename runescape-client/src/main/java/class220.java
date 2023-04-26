import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public abstract class class220 extends Rasterizer2D {
	@ObfuscatedName("af")
	boolean field2531;
	@ObfuscatedName("an")
	boolean field2527;
	@ObfuscatedName("aq")
	int[] field2529;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	class236 field2530;

	@ObfuscatedSignature(
		descriptor = "(Ljg;)V"
	)
	class220(class236 var1) {
		this.field2531 = false; // L: 6
		this.field2527 = false; // L: 7
		this.field2529 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 16
		this.field2530 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([III[FI)V",
		garbageValue = "-643944102"
	)
	void method4477(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9384(var1, var2, var3, var4); // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIFFFIIIBBBBB)V",
		garbageValue = "-71"
	)
	void method4478(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = class161.method3446(var10, var13, var14, var15, var16); // L: 49
		var11 = class161.method3446(var11, var13, var14, var15, var16); // L: 50
		var12 = class161.method3446(var12, var13, var14, var15, var16); // L: 51
		this.vmethod4970(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIFFFIBBBBI)V",
		garbageValue = "-1620123395"
	)
	void method4512(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = class161.method3446(var10, var11, var12, var13, var14);
		var10 = this.field2529[var15]; // L: 57
		this.vmethod4961(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 58
	} // L: 59

	@ObfuscatedName("ab")
	abstract void vmethod4970(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("aq")
	abstract void vmethod4961(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("al")
	abstract void vmethod5007(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("at")
	abstract void vmethod4954(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1445318523"
	)
	public static void method4513(int var0) {
		if (class297.musicPlayerStatus != 0) { // L: 52
			class100.musicTrackVolume = var0;
		} else {
			class475.midiPcmStream.setPcmStreamVolume(var0); // L: 53
		}

	} // L: 54

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
	)
	static void method4514() {
		class129.method3124(24); // L: 2223
		class205.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2224
	} // L: 2225

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "-5"
	)
	public static int method4489(byte[] var0, int var1) {
		return SequenceDefinition.method4176(var0, 0, var1); // L: 56
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILlb;ZB)V",
		garbageValue = "89"
	)
	static void method4493(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class88.getWorldMap().getMapArea(var0); // L: 5251
		int var4 = MusicPatchNode.localPlayer.plane; // L: 5252
		int var5 = WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7); // L: 5253
		int var6 = GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7); // L: 5254
		Coord var7 = new Coord(var4, var5, var6); // L: 5255
		class88.getWorldMap().method8508(var3, var7, var1, var2); // L: 5256
	} // L: 5257
}
