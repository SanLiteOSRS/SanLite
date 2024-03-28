import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("az")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ah")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	} // L: 20

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2141524519"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1712781729"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return UserComparator7.method2883(); // L: 31
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;Lto;I)Lto;",
		garbageValue = "53499372"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = class193.method3722(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-783899767"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4958
			var2 = 1;
		}

		if (var3 < 1) { // L: 4959
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4960
		int var6;
		if (var5 < 0) { // L: 4962
			var6 = Client.field785;
		} else if (var5 >= 100) { // L: 4963
			var6 = Client.field786;
		} else {
			var6 = (Client.field786 - Client.field785) * var5 / 100 + Client.field785; // L: 4964
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4965
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field791) { // L: 4966
			var14 = Client.field791; // L: 4967
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4968
			if (var6 > Client.field728) { // L: 4969
				var6 = Client.field728; // L: 4970
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 4971
				var9 = (var2 - var8) / 2; // L: 4972
				if (var4) { // L: 4973
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4974
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4975
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4976
				}

				var0 += var9; // L: 4978
				var2 -= var9 * 2; // L: 4979
			}
		} else if (var7 > Client.field792) { // L: 4982
			var14 = Client.field792; // L: 4983
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 4984
			if (var6 < Client.field789) { // L: 4985
				var6 = Client.field789; // L: 4986
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 4987
				var9 = (var3 - var8) / 2; // L: 4988
				if (var4) { // L: 4989
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4990
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4991
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4992
				}

				var1 += var9; // L: 4994
				var3 -= var9 * 2; // L: 4995
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4998
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4999
			int[] var13 = new int[9]; // L: 5001

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 5002
				int var10 = var9 * 32 + 15 + 128; // L: 5003
				int var11 = UserComparator5.method2898(var10); // L: 5004
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5005
				var11 = class10.method92(var11, var3); // L: 5006
				var13[var9] = var12 * var11 >> 16; // L: 5007
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 5009
		}

		Client.viewportOffsetX = var0; // L: 5012
		Client.viewportOffsetY = var1; // L: 5013
		Client.viewportWidth = var2; // L: 5014
		Client.viewportHeight = var3; // L: 5015
	} // L: 5016
}
