import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1676;
	@ObfuscatedName("au")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1687463019
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-485826730"
	)
	static final int method3121(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 13
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	static int method3119(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 57
		if (var1 == null) { // L: 58
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 59 60
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-973066355"
	)
	static final void method3122(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) { // L: 4171
			Object var1 = null; // L: 4172
			var2 = 65536; // L: 4173
			if (var0.targetIndex < var2) { // L: 4174
				var1 = Client.npcs[var0.targetIndex]; // L: 4175
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4178
			}

			if (var1 != null) { // L: 4180
				var3 = var0.x - ((Actor)var1).x; // L: 4181
				var4 = var0.y - ((Actor)var1).y; // L: 4182
				if (var3 != 0 || var4 != 0) { // L: 4183
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047; // L: 4187
					var0.orientation = var6; // L: 4189
				}
			} else if (var0.false0) { // L: 4192
				var0.targetIndex = -1; // L: 4193
				var0.false0 = false; // L: 4194
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1271 > 0) { // L: 4197
			var7 = -1; // L: 4198
			if (var0.field1235 != -1 && var0.field1236 != -1) { // L: 4199
				var2 = var0.field1235 * 128 - UrlRequester.baseX * 8192 + 64; // L: 4200
				var3 = var0.field1236 * 128 - class47.baseY * 8192 + 64; // L: 4201
				var4 = var0.x - var2; // L: 4202
				int var8 = var0.y - var3; // L: 4203
				if (var4 != 0 || var8 != 0) { // L: 4204
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047; // L: 4207
					var7 = var6; // L: 4209
				}
			} else if (var0.field1234 != -1) { // L: 4212
				var7 = var0.field1234; // L: 4213
			}

			if (var7 != -1) { // L: 4215
				var0.orientation = var7; // L: 4216
				if (var0.field1237) { // L: 4217
					var0.rotation = var0.orientation; // L: 4218
				}
			}

			var0.method2393(); // L: 4221
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4223
		if (var7 != 0) { // L: 4224
			boolean var10 = true; // L: 4225
			boolean var11 = true; // L: 4226
			++var0.field1239; // L: 4227
			var4 = var7 > 1024 ? -1 : 1; // L: 4228
			var0.rotation += var0.field1266 * var4; // L: 4229
			boolean var12 = true; // L: 4230
			if (var7 < var0.field1266 || var7 > 2048 - var0.field1266) { // L: 4231
				var0.rotation = var0.orientation; // L: 4232
				var12 = false; // L: 4233
			}

			if (var0.field1266 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1239 > 25 || var12)) { // L: 4235
				if (var4 == -1 && var0.field1204 != -1) { // L: 4236
					var0.movementSequence = var0.field1204; // L: 4237
				} else if (var4 == 1 && var0.field1265 != -1) { // L: 4239
					var0.movementSequence = var0.field1265; // L: 4240
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4243
				}
			}

			var0.rotation &= 2047; // L: 4247
		} else {
			if (var0.false0) { // L: 4250
				var0.targetIndex = -1; // L: 4251
				var0.false0 = false; // L: 4252
			}

			var0.field1239 = 0; // L: 4254
		}

	} // L: 4256

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)V",
		garbageValue = "70"
	)
	static final void method3120(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) { // L: 11277
			var1 = var0.field3699; // L: 11278
			var2 = var0.id; // L: 11279
			var3 = var0.itemId; // L: 11280
			UserComparator8.method2874(var1, "", 24, 0, 0, var2, var3, false); // L: 11282
		}

		int var4;
		String var9;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11286
			var1 = class300.Widget_getSpellActionName(var0); // L: 11287
			if (var1 != null) { // L: 11288
				var9 = class217.colorStartTag(65280) + var0.field3758; // L: 11289
				var3 = var0.id; // L: 11290
				var4 = var0.itemId; // L: 11291
				UserComparator8.method2874(var1, var9, 25, 0, -1, var3, var4, false); // L: 11293
			}
		}

		if (var0.buttonType == 3) { // L: 11298
			class385.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11299
		}

		if (var0.buttonType == 4) { // L: 11302
			class385.insertMenuItemNoShift(var0.field3699, "", 28, 0, 0, var0.id); // L: 11303
		}

		if (var0.buttonType == 5) { // L: 11306
			class385.insertMenuItemNoShift(var0.field3699, "", 29, 0, 0, var0.id); // L: 11307
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11310
			class385.insertMenuItemNoShift(var0.field3699, "", 30, 0, -1, var0.id); // L: 11311
		}

		if (var0.isIf3) { // L: 11314
			int var5;
			int var6;
			int var7;
			String var11;
			String var12;
			if (Client.isSpellSelected) { // L: 11315
				var2 = class194.getWidgetFlags(var0); // L: 11317
				boolean var10 = (var2 >> 21 & 1) != 0; // L: 11319
				if (var10 && (Canvas.selectedSpellFlags & 32) == 32) { // L: 11321
					var11 = Client.field709; // L: 11322
					var12 = Client.field720 + " " + "->" + " " + var0.dataText; // L: 11323
					var5 = var0.childIndex; // L: 11324
					var6 = var0.id; // L: 11325
					var7 = var0.itemId; // L: 11326
					UserComparator8.method2874(var11, var12, 58, 0, var5, var6, var7, false); // L: 11328
				}
			} else {
				for (int var16 = 9; var16 >= 5; --var16) { // L: 11334
					var4 = class194.getWidgetFlags(var0); // L: 11338
					boolean var14 = (var4 >> var16 + 1 & 1) != 0; // L: 11340
					if (!var14 && var0.onOp == null) { // L: 11342
						var9 = null; // L: 11343
					} else if (var0.actions != null && var0.actions.length > var16 && var0.actions[var16] != null && var0.actions[var16].trim().length() != 0) { // L: 11346
						var9 = var0.actions[var16]; // L: 11350
					} else {
						var9 = null; // L: 11347
					}

					if (var9 != null) { // L: 11353
						var12 = var0.dataText; // L: 11354
						var5 = var16 + 1; // L: 11355
						var6 = var0.childIndex; // L: 11356
						var7 = var0.id; // L: 11357
						int var8 = var0.itemId; // L: 11358
						UserComparator8.method2874(var9, var12, 1007, var5, var6, var7, var8, false); // L: 11360
					}
				}

				var1 = class300.Widget_getSpellActionName(var0); // L: 11365
				if (var1 != null) { // L: 11366
					var9 = var0.dataText; // L: 11367
					var3 = var0.childIndex; // L: 11368
					var4 = var0.id; // L: 11369
					var5 = var0.itemId; // L: 11370
					UserComparator8.method2874(var1, var9, 25, 0, var3, var4, var5, false); // L: 11372
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11376
					var5 = class194.getWidgetFlags(var0); // L: 11380
					boolean var15 = (var5 >> var2 + 1 & 1) != 0; // L: 11382
					if (!var15 && var0.onOp == null) { // L: 11384
						var11 = null; // L: 11385
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11388
						var11 = var0.actions[var2]; // L: 11392
					} else {
						var11 = null; // L: 11389
					}

					if (var11 != null) { // L: 11395
						UserComparator8.method2874(var11, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11396
					}
				}

				var3 = class194.getWidgetFlags(var0); // L: 11401
				boolean var13 = (var3 & 1) != 0; // L: 11403
				if (var13) { // L: 11405
					class385.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11406
				}
			}
		}

	} // L: 11411
}
