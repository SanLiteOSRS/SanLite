import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1446438165
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 49283072
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 448727349
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 844723307
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -757999873
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 621012193
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -830283377
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3448042175855343097L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1288984241
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}
}
