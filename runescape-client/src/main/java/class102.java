import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class102 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-50"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 116
		int var4 = 0; // L: 117

		for (int var5 = 0; var5 < var2; ++var5) { // L: 118
			int var6 = var0[var5 + var1] & 255; // L: 119
			if (var6 != 0) { // L: 120
				if (var6 >= 128 && var6 < 160) { // L: 121
					char var7 = class403.cp1252AsciiExtension[var6 - 128]; // L: 122
					if (var7 == 0) { // L: 123
						var7 = '?';
					}

					var6 = var7; // L: 124
				}

				var3[var4++] = (char)var6; // L: 126
			}
		}

		return new String(var3, 0, var4); // L: 128
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lvd;",
		garbageValue = "-121"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 377
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 378
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38); // L: 379
		SpritePixels var8;
		if (!var5) { // L: 381
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 382
			if (var8 != null) { // L: 383
				return var8;
			}
		}

		ItemComposition var9 = ArchiveDiskActionHandler.ItemComposition_get(var0); // L: 385
		if (var1 > 1 && var9.countobj != null) { // L: 386
			int var10 = -1; // L: 387

			for (int var11 = 0; var11 < 10; ++var11) { // L: 388
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 389
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 391
				var9 = ArchiveDiskActionHandler.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 393
		if (var20 == null) { // L: 394
			return null;
		} else {
			SpritePixels var21 = null; // L: 395
			if (var9.noteTemplate != -1) { // L: 396
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 397
				if (var21 == null) { // L: 398
					return null;
				}
			} else if (var9.notedId != -1) { // L: 400
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 401
				if (var21 == null) { // L: 402
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 404
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 405
				if (var21 == null) { // L: 406
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 408
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 409
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 410
			float[] var15 = Rasterizer2D.field5269; // L: 411
			int[] var16 = new int[4]; // L: 412
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 413
			var8 = new SpritePixels(36, 32); // L: 414
			Rasterizer3D.method5291(var8.pixels, 36, 32, (float[])null); // L: 415
			Rasterizer2D.Rasterizer2D_clear(); // L: 416
			Rasterizer3D.method5292(); // L: 417
			Rasterizer3D.method5277(16, 16); // L: 418
			Rasterizer3D.field2820.field3085 = false; // L: 419
			if (var9.placeholderTemplate != -1) { // L: 420
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 421
			if (var5) { // L: 422
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 423
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 424
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 425
			var20.calculateBoundsCylinder(); // L: 426
			var20.method5782(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 427
			if (var9.notedId != -1) { // L: 428
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 429
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 430
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 431
				var8.shadow(var3);
			}

			Rasterizer3D.method5291(var8.pixels, 36, 32, (float[])null); // L: 432
			if (var9.noteTemplate != -1) { // L: 433
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 434
				Decimator.field406.draw(class368.method7010(var1), 0, 9, 16776960, 1); // L: 435
			}

			if (!var5) { // L: 437
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5291(var12, var13, var14, var15); // L: 438
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 439
			Rasterizer3D.method5292(); // L: 440
			Rasterizer3D.field2820.field3085 = true; // L: 441
			return var8; // L: 442
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2088552189"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ViewportMouse.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 12720
		var0.packetBuffer.writeByte(0); // L: 12721
		Client.packetWriter.addNode(var0); // L: 12722
	} // L: 12723
}
