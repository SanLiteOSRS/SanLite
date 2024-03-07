import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aq")
	@Export("args")
	Object[] args;
	@ObfuscatedName("aw")
	boolean field1095;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 419142951
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1947092785
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1652910979
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 407049349
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1688799383
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 966091511
	)
	int field1102;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 585647715
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-36"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-534052566"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "-53018263"
	)
	public void method2355(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "57"
	)
	static final void method2361(boolean var0) {
		if (var0) { // L: 3149
			Client.field573 = Login.field966 ? class125.field1490 : class125.field1497; // L: 3150
		} else {
			Client.field573 = class30.clientPreferences.method2555(Login.Login_username) ? class125.field1495 : class125.field1498; // L: 3153
		}

	} // L: 3155

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1506392323"
	)
	static final void method2360(int var0, int var1) {
		if (var0 < 128) { // L: 3982
			var0 = 128; // L: 3983
		} else if (var0 > 383) { // L: 3985
			var0 = 383; // L: 3986
		}

		if (FriendSystem.cameraPitch < var0) { // L: 3988
			FriendSystem.cameraPitch = (var0 - FriendSystem.cameraPitch) * class18.field86 / 1000 + FriendSystem.cameraPitch + class135.field1618; // L: 3989
			if (FriendSystem.cameraPitch > var0) { // L: 3990
				FriendSystem.cameraPitch = var0; // L: 3991
			}
		} else if (FriendSystem.cameraPitch > var0) { // L: 3994
			FriendSystem.cameraPitch -= (FriendSystem.cameraPitch - var0) * class18.field86 / 1000 + class135.field1618; // L: 3995
			if (FriendSystem.cameraPitch < var0) { // L: 3996
				FriendSystem.cameraPitch = var0; // L: 3997
			}
		}

		var1 &= 2047; // L: 4000
		int var2 = var1 - Script.cameraYaw; // L: 4001
		if (var2 > 1024) { // L: 4002
			var2 -= 2048; // L: 4003
		} else if (var2 < -1024) { // L: 4005
			var2 += 2048; // L: 4006
		}

		if (var2 > 0) { // L: 4008
			Script.cameraYaw = Script.cameraYaw + class135.field1618 + var2 * class18.field86 / 1000; // L: 4009
			Script.cameraYaw &= 2047; // L: 4010
		} else if (var2 < 0) { // L: 4012
			Script.cameraYaw -= class135.field1618 + -var2 * class18.field86 / 1000; // L: 4013
			Script.cameraYaw &= 2047; // L: 4014
		}

		int var3 = var1 - Script.cameraYaw; // L: 4016
		if (var3 > 1024) { // L: 4017
			var3 -= 2048; // L: 4018
		} else if (var3 < -1024) { // L: 4020
			var3 += 2048; // L: 4021
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4023
			Script.cameraYaw = var1; // L: 4024
		}

	} // L: 4026

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IS)V",
		garbageValue = "-7046"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var4;
		int var5;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) { // L: 4203
			class47.method841(var0);
		} else if (var0.field1271 >= Client.cycle) { // L: 4204
			boolean var2 = var0.field1271 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4205
			if (!var2) { // L: 4206
				SequenceDefinition var3 = MilliClock.SequenceDefinition_get(var0.sequence); // L: 4207
				if (var3 != null && !var3.isCachedModelIdSet()) { // L: 4208
					var2 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame]; // L: 4212
				} else {
					var2 = true; // L: 4209
				}
			}

			if (var2) { // L: 4215
				var9 = var0.field1271 - var0.spotAnimation; // L: 4216
				var4 = Client.cycle - var0.spotAnimation; // L: 4217
				var5 = var0.field1257 * 128 + var0.field1212 * 64; // L: 4218
				var6 = var0.field1259 * 128 + var0.field1212 * 64; // L: 4219
				int var7 = var0.field1258 * 128 + var0.field1212 * 64; // L: 4220
				int var8 = var0.field1248 * 128 + var0.field1212 * 64; // L: 4221
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9; // L: 4222
				var0.y = (var4 * var8 + var6 * (var9 - var4)) / var9; // L: 4223
			}

			var0.field1279 = 0; // L: 4225
			var0.orientation = var0.field1223; // L: 4226
			var0.rotation = var0.orientation; // L: 4227
		} else {
			WorldMapLabelSize.method4623(var0); // L: 4229
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4230
			var0.sequence = -1; // L: 4231
			var0.spotAnimation = 0; // L: 4232
			var0.field1271 = 0; // L: 4233
			var0.method2468(); // L: 4234
			var0.x = var0.pathX[0] * 128 + var0.field1212 * 64; // L: 4235
			var0.y = var0.pathY[0] * 128 + var0.field1212 * 64; // L: 4236
			var0.method2462(); // L: 4237
		}

		if (VarpDefinition.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4239 4240
			var0.sequence = -1; // L: 4241
			var0.spotAnimation = 0; // L: 4242
			var0.field1271 = 0; // L: 4243
			var0.method2468(); // L: 4244
			var0.x = var0.pathX[0] * 128 + var0.field1212 * 64; // L: 4245
			var0.y = var0.pathY[0] * 128 + var0.field1212 * 64; // L: 4246
			var0.method2462(); // L: 4247
		}

		if (var0.targetIndex != -1) { // L: 4251
			Object var10 = null; // L: 4252
			var9 = 65536; // L: 4253
			if (var0.targetIndex < var9) { // L: 4254
				var10 = Client.npcs[var0.targetIndex]; // L: 4255
			} else {
				var10 = Client.players[var0.targetIndex - var9]; // L: 4258
			}

			if (var10 != null) { // L: 4260
				var4 = var0.x - ((Actor)var10).x; // L: 4261
				var5 = var0.y - ((Actor)var10).y; // L: 4262
				if (var4 != 0 || var5 != 0) { // L: 4263
					var0.orientation = ServerPacket.method6052(var4, var5); // L: 4264
				}
			} else if (var0.field1241) { // L: 4267
				var0.targetIndex = -1; // L: 4268
				var0.field1241 = false; // L: 4269
			}
		}

		int var12;
		if (var0.pathLength == 0 || var0.field1279 > 0) { // L: 4272
			var12 = -1; // L: 4273
			if (var0.field1243 != -1 && var0.field1244 != -1) { // L: 4274
				var9 = var0.field1243 * 128 - Projectile.baseX * 8192 + 64; // L: 4275
				var4 = var0.field1244 * 128 - GameEngine.baseY * 1024 + 64; // L: 4276
				var5 = var0.x - var9; // L: 4277
				var6 = var0.y - var4; // L: 4278
				if (var5 != 0 || var6 != 0) { // L: 4279
					var12 = ServerPacket.method6052(var5, var6); // L: 4280
				}
			} else if (var0.field1242 != -1) { // L: 4283
				var12 = var0.field1242; // L: 4284
			}

			if (var12 != -1) { // L: 4286
				var0.orientation = var12; // L: 4287
				if (var0.field1245) { // L: 4288
					var0.rotation = var0.orientation; // L: 4289
				}
			}

			var0.method2470(); // L: 4292
		}

		var12 = var0.orientation - var0.rotation & 2047; // L: 4294
		if (var12 != 0) { // L: 4295
			boolean var15 = true; // L: 4296
			boolean var13 = true; // L: 4297
			++var0.field1227; // L: 4298
			var5 = var12 > 1024 ? -1 : 1; // L: 4299
			var0.rotation += var0.field1249 * var5; // L: 4300
			boolean var14 = true; // L: 4301
			if (var12 < var0.field1249 || var12 > 2048 - var0.field1249) { // L: 4302
				var0.rotation = var0.orientation; // L: 4303
				var14 = false; // L: 4304
			}

			if (var0.field1249 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1227 > 25 || var14)) { // L: 4306
				if (var5 == -1 && var0.field1266 != -1) { // L: 4307
					var0.movementSequence = var0.field1266; // L: 4308
				} else if (var5 == 1 && var0.field1213 != -1) { // L: 4310
					var0.movementSequence = var0.field1213; // L: 4311
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4314
				}
			}

			var0.rotation &= 2047; // L: 4318
		} else {
			if (var0.field1241) { // L: 4321
				var0.targetIndex = -1; // L: 4322
				var0.field1241 = false; // L: 4323
			}

			var0.field1227 = 0; // L: 4325
		}

		class439.method8184(var0); // L: 4328
	} // L: 4329
}
