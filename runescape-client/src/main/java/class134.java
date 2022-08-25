import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class134 extends class144 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -305870119
	)
	int field1573;
	@ObfuscatedName("h")
	byte field1574;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 469034561
	)
	int field1577;
	@ObfuscatedName("v")
	String field1576;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1573 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1539485988"
	)
	void vmethod3074(Buffer var1) {
		this.field1573 = var1.readUnsignedShort(); // L: 109
		this.field1574 = var1.readByte(); // L: 110
		this.field1577 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1576 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-1270425284"
	)
	void vmethod3073(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1573); // L: 117
		var2.rank = this.field1574; // L: 118
		var2.world = this.field1577; // L: 119
		var2.username = new Username(this.field1576); // L: 120
	} // L: 121

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;Lls;I)V",
		garbageValue = "1275882912"
	)
	public static void method2851(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class20.SequenceDefinition_archive = var0; // L: 48
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 49
		GZipDecompressor.SequenceDefinition_skeletonsArchive = var2; // L: 50
	} // L: 51

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1864938082"
	)
	public static void method2857(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1809 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1782317198"
	)
	public static int method2860(int var0) {
		return var0 >> 17 & 7; // L: 21
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "175729561"
	)
	static boolean method2858(Date var0) {
		Date var1 = UserComparator7.method2563(); // L: 1093
		return var0.after(var1); // L: 1094
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "55931143"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4749
			var2 = 1;
		}

		if (var3 < 1) { // L: 4750
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4751
		int var6;
		if (var5 < 0) { // L: 4753
			var6 = Client.field561;
		} else if (var5 >= 100) { // L: 4754
			var6 = Client.field744;
		} else {
			var6 = (Client.field744 - Client.field561) * var5 / 100 + Client.field561; // L: 4755
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4756
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field749) { // L: 4757
			var14 = Client.field749; // L: 4758
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4759
			if (var6 > Client.field748) { // L: 4760
				var6 = Client.field748; // L: 4761
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 4762
				var9 = (var2 - var8) / 2; // L: 4763
				if (var4) { // L: 4764
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4765
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4766
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4767
				}

				var0 += var9; // L: 4769
				var2 -= var9 * 2; // L: 4770
			}
		} else if (var7 > Client.field724) { // L: 4773
			var14 = Client.field724; // L: 4774
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4775
			if (var6 < Client.field747) { // L: 4776
				var6 = Client.field747; // L: 4777
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 4778
				var9 = (var3 - var8) / 2; // L: 4779
				if (var4) { // L: 4780
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4781
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4782
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4783
				}

				var1 += var9; // L: 4785
				var3 -= var9 * 2; // L: 4786
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4789
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4790
			int[] var13 = new int[9]; // L: 4792

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 4793
				int var10 = var9 * 32 + 15 + 128; // L: 4794
				int var11 = HealthBarUpdate.method2170(var10); // L: 4795
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4796
				var11 = World.method1624(var11, var3); // L: 4797
				var13[var9] = var12 * var11 >> 16; // L: 4798
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 4800
		}

		Client.viewportOffsetX = var0; // L: 4803
		Client.viewportOffsetY = var1; // L: 4804
		Client.viewportWidth = var2; // L: 4805
		Client.viewportHeight = var3; // L: 4806
	} // L: 4807
}
