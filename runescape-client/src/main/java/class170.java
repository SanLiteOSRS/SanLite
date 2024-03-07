import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class170 {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1832;
	@ObfuscatedName("al")
	public short[] field1834;
	@ObfuscatedName("ai")
	public short[] field1835;

	public class170(int var1) {
		ItemComposition var2 = ArchiveDiskActionHandler.ItemComposition_get(var1); // L: 12
		if (var2.method3983()) { // L: 13
			this.field1834 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1834, 0, this.field1834.length); // L: 15
		}

		if (var2.method3984()) { // L: 17
			this.field1835 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1835, 0, this.field1835.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIS)Z",
		garbageValue = "5801"
	)
	static boolean method3523(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class371.field4333.field4331) { // L: 8519
			WallObject var7 = Actor.scene.method5463(var0, var1, var2); // L: 8520
			if (var7 != null) { // L: 8521
				var8 = Message.Entity_unpackID(var7.tag); // L: 8522
				if (var3 == WorldMapDecorationType.field3931.id) { // L: 8523
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1); // L: 8524
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2); // L: 8525
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1); // L: 8528
				}

				return true; // L: 8530
			}
		} else if (var5 == class371.field4332.field4331) { // L: 8533
			DecorativeObject var9 = Actor.scene.method5443(var0, var1, var2); // L: 8534
			if (var9 != null) { // L: 8535
				var8 = Message.Entity_unpackID(var9.tag); // L: 8536
				if (var3 != WorldMapDecorationType.field3932.id && var3 != WorldMapDecorationType.field3915.id) { // L: 8537
					if (var3 == WorldMapDecorationType.field3927.id) { // L: 8540
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8541
					} else if (var3 == WorldMapDecorationType.field3930.id) { // L: 8543
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8544
					} else if (var3 == WorldMapDecorationType.field3918.id) { // L: 8546
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8547
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2); // L: 8548
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1); // L: 8538
				}

				return true; // L: 8550
			}
		} else if (var5 == class371.field4329.field4331) { // L: 8553
			GameObject var10 = Actor.scene.getGameObject(var0, var1, var2); // L: 8554
			if (var3 == WorldMapDecorationType.field3912.id) { // L: 8555
				var3 = WorldMapDecorationType.field3929.id;
			}

			if (var10 != null) { // L: 8556
				var10.renderable = new DynamicObject(Message.Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable); // L: 8557
				return true; // L: 8558
			}
		} else if (var5 == class371.field4330.field4331) { // L: 8561
			GroundObject var11 = Actor.scene.getGroundObject(var0, var1, var2); // L: 8562
			if (var11 != null) { // L: 8563
				var11.renderable = new DynamicObject(Message.Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable); // L: 8564
				return true; // L: 8565
			}
		}

		return false; // L: 8568
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "60"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ClanChannelMember.scrollBarSprites[0].drawAt(var0, var1); // L: 11264
		ClanChannelMember.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11265
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field605); // L: 11266
		int var5 = var3 * (var3 - 32) / var4; // L: 11267
		if (var5 < 8) { // L: 11268
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11269
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field609); // L: 11270
		Rasterizer2D.method9796(var0, var6 + var1 + 16, var5, Client.field667); // L: 11271
		Rasterizer2D.method9796(var0 + 1, var6 + var1 + 16, var5, Client.field667); // L: 11272
		Rasterizer2D.method9794(var0, var6 + var1 + 16, 16, Client.field667); // L: 11273
		Rasterizer2D.method9794(var0, var6 + var1 + 17, 16, Client.field667); // L: 11274
		Rasterizer2D.method9796(var0 + 15, var6 + var1 + 16, var5, Client.field618); // L: 11275
		Rasterizer2D.method9796(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field618); // L: 11276
		Rasterizer2D.method9794(var0, var5 + var6 + var1 + 15, 16, Client.field618); // L: 11277
		Rasterizer2D.method9794(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field618); // L: 11278
	} // L: 11279
}
