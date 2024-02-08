import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("af")
	@Export("type")
	char type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -257601661
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aq")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ar")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1803569924"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1930168522"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-604989476"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class400.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "501065922"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1549455343"
	)
	public static int method3877() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 58
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2088500528"
	)
	static final void method3870(boolean var0) {
		if (var0) { // L: 3061
			Client.field575 = Login.field913 ? class124.field1470 : class124.field1474; // L: 3062
		} else {
			Client.field575 = class93.clientPreferences.method2559(Login.Login_username) ? class124.field1472 : class124.field1471; // L: 3065
		}

	} // L: 3067

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "860610886"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var3;
		int var4;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) { // L: 4150
			int var2 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4151
			var9 = var0.field1175 * 423432192 + var0.field1223 * 128; // L: 4152
			var4 = var0.field1175 * 423432192 + var0.field1225 * 128; // L: 4153
			var0.x += (var9 - var0.x) / var2; // L: 4154
			var0.y += (var4 - var0.y) / var2; // L: 4155
			var0.field1245 = 0; // L: 4156
			var0.orientation = var0.field1173; // L: 4157
		} else if (var0.field1228 >= Client.cycle) { // L: 4159
			boolean var12 = var0.field1228 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4160
			if (!var12) { // L: 4161
				var3 = class9.SequenceDefinition_get(var0.sequence); // L: 4162
				if (var3 != null && !var3.isCachedModelIdSet()) { // L: 4163
					var12 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame]; // L: 4167
				} else {
					var12 = true; // L: 4164
				}
			}

			if (var12) { // L: 4170
				var9 = var0.field1228 - var0.spotAnimation; // L: 4171
				var4 = Client.cycle - var0.spotAnimation; // L: 4172
				int var5 = var0.field1175 * 423432192 + var0.field1223 * 128; // L: 4173
				var6 = var0.field1175 * 423432192 + var0.field1225 * 128; // L: 4174
				int var7 = var0.field1175 * 423432192 + var0.field1224 * 128; // L: 4175
				int var8 = var0.field1175 * 423432192 + var0.field1226 * 128; // L: 4176
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9; // L: 4177
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9; // L: 4178
			}

			var0.field1245 = 0; // L: 4180
			var0.orientation = var0.field1173; // L: 4181
			var0.rotation = var0.orientation; // L: 4182
		} else {
			GraphicsObject.method2141(var0); // L: 4184
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4185
			var0.sequence = -1; // L: 4186
			var0.spotAnimation = 0; // L: 4187
			var0.field1228 = 0; // L: 4188
			var0.method2458(); // L: 4189
			var0.x = var0.field1175 * 423432192 + var0.pathX[0] * 128; // L: 4190
			var0.y = var0.field1175 * 423432192 + var0.pathY[0] * 128; // L: 4191
			var0.method2468(); // L: 4192
		}

		if (class25.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4194 4195
			var0.sequence = -1; // L: 4196
			var0.spotAnimation = 0; // L: 4197
			var0.field1228 = 0; // L: 4198
			var0.method2458(); // L: 4199
			var0.x = var0.field1175 * 423432192 + var0.pathX[0] * 128; // L: 4200
			var0.y = var0.field1175 * 423432192 + var0.pathY[0] * 128; // L: 4201
			var0.method2468(); // L: 4202
		}

		PendingSpawn.method2449(var0); // L: 4205
		var0.isWalking = false; // L: 4207
		if (var0.movementSequence != -1) { // L: 4208
			SequenceDefinition var10 = class9.SequenceDefinition_get(var0.movementSequence); // L: 4209
			if (var10 != null) { // L: 4210
				if (!var10.isCachedModelIdSet() && var10.frameIds != null) { // L: 4211
					++var0.field1214; // L: 4212
					if (var0.movementFrame < var10.frameIds.length && var0.field1214 > var10.frameLengths[var0.movementFrame]) { // L: 4213
						var0.field1214 = 1; // L: 4214
						++var0.movementFrame; // L: 4215
						UserComparator8.method2938(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4216
					}

					if (var0.movementFrame >= var10.frameIds.length) { // L: 4218
						if (var10.frameCount > 0) { // L: 4219
							var0.movementFrame -= var10.frameCount; // L: 4220
							if (var10.field2235) { // L: 4221
								++var0.field1196;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var10.frameIds.length || var10.field2235 && var0.field1196 >= var10.field2242) { // L: 4222
								var0.field1214 = 0; // L: 4223
								var0.movementFrame = 0; // L: 4224
								var0.field1196 = 0; // L: 4225
							}
						} else {
							var0.field1214 = 0; // L: 4229
							var0.movementFrame = 0; // L: 4230
						}

						UserComparator8.method2938(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4232
					}
				} else if (var10.isCachedModelIdSet()) { // L: 4235
					++var0.movementFrame; // L: 4236
					var9 = var10.method4106(); // L: 4237
					if (var0.movementFrame < var9) { // L: 4238
						ModeWhere.method7304(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4239
					} else {
						if (var10.frameCount > 0) { // L: 4242
							var0.movementFrame -= var10.frameCount; // L: 4243
							if (var10.field2235) { // L: 4244
								++var0.field1196;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var9 || var10.field2235 && var0.field1196 >= var10.field2242) { // L: 4245
								var0.movementFrame = 0; // L: 4246
								var0.field1214 = 0; // L: 4247
								var0.field1196 = 0; // L: 4248
							}
						} else {
							var0.field1214 = 0; // L: 4252
							var0.movementFrame = 0; // L: 4253
						}

						ModeWhere.method7304(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4255
					}
				} else {
					var0.movementSequence = -1; // L: 4258
				}
			} else {
				var0.movementSequence = -1; // L: 4260
			}
		}

		IterableNodeHashTableIterator var14 = new IterableNodeHashTableIterator(var0.method2455()); // L: 4262

		for (class552 var13 = (class552)var14.method9062(); var13 != null; var13 = (class552)var14.next()) { // L: 4263
			if (var13.field5325 != -1 && Client.cycle >= var13.field5322) { // L: 4264
				var4 = class151.SpotAnimationDefinition_get(var13.field5325).sequence; // L: 4267
				if (var4 == -1) { // L: 4268
					var13.remove(); // L: 4269
					--var0.field1247; // L: 4270
				} else {
					var13.field5323 = Math.max(var13.field5323, 0); // L: 4273
					SequenceDefinition var11 = class9.SequenceDefinition_get(var4); // L: 4274
					if (var11.frameIds != null && !var11.isCachedModelIdSet()) { // L: 4275
						++var13.field5324; // L: 4276
						if (var13.field5323 < var11.frameIds.length && var13.field5324 > var11.frameLengths[var13.field5323]) { // L: 4277
							var13.field5324 = 1; // L: 4278
							++var13.field5323; // L: 4279
							UserComparator8.method2938(var11, var13.field5323, var0.x, var0.y, var0); // L: 4280
						}

						if (var13.field5323 >= var11.frameIds.length) { // L: 4282
							var13.remove(); // L: 4283
							--var0.field1247; // L: 4284
						}
					} else if (var11.isCachedModelIdSet()) { // L: 4287
						++var13.field5323; // L: 4288
						var6 = var11.method4106(); // L: 4289
						if (var13.field5323 < var6) { // L: 4290
							ModeWhere.method7304(var11, var13.field5323, var0.x, var0.y, var0); // L: 4291
						} else {
							var13.remove(); // L: 4294
							--var0.field1247; // L: 4295
						}
					} else {
						var13.remove(); // L: 4299
						--var0.field1247; // L: 4300
					}
				}
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4303
			var3 = class9.SequenceDefinition_get(var0.sequence); // L: 4304
			if (var3.field2244 == 1 && var0.field1215 > 0 && var0.spotAnimation <= Client.cycle && var0.field1228 < Client.cycle) { // L: 4305 4306
				var0.sequenceDelay = 1; // L: 4307
				return; // L: 4363
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4312
			var3 = class9.SequenceDefinition_get(var0.sequence); // L: 4313
			if (var3 == null) { // L: 4314
				var0.sequence = -1; // L: 4359
			} else if (!var3.isCachedModelIdSet() && var3.frameIds != null) { // L: 4315
				++var0.sequenceFrameCycle; // L: 4316
				if (var0.sequenceFrame < var3.frameIds.length && var0.sequenceFrameCycle > var3.frameLengths[var0.sequenceFrame]) { // L: 4317
					var0.sequenceFrameCycle = 1; // L: 4318
					++var0.sequenceFrame; // L: 4319
					UserComparator8.method2938(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4320
				}

				if (var0.sequenceFrame >= var3.frameIds.length) { // L: 4322
					var0.sequenceFrame -= var3.frameCount; // L: 4323
					++var0.field1220; // L: 4324
					if (var0.field1220 >= var3.field2242) { // L: 4325
						var0.sequence = -1; // L: 4326
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3.frameIds.length) { // L: 4328
						UserComparator8.method2938(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4332
					} else {
						var0.sequence = -1; // L: 4329
					}
				}

				var0.isWalking = var3.field2238; // L: 4335
			} else if (var3.isCachedModelIdSet()) { // L: 4337
				++var0.sequenceFrame; // L: 4338
				var4 = var3.method4106(); // L: 4339
				if (var0.sequenceFrame < var4) { // L: 4340
					ModeWhere.method7304(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4341
				} else {
					var0.sequenceFrame -= var3.frameCount; // L: 4344
					++var0.field1220; // L: 4345
					if (var0.field1220 >= var3.field2242) { // L: 4346
						var0.sequence = -1; // L: 4347
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) { // L: 4349
						ModeWhere.method7304(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4353
					} else {
						var0.sequence = -1; // L: 4350
					}
				}
			} else {
				var0.sequence = -1; // L: 4357
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4361
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1382784013"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4998
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4999
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5000
				int var3 = var2.x >> 7; // L: 5001
				int var4 = var2.y >> 7; // L: 5002
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5003
					if (var2.field1175 * 1348793408 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5004
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5005
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5006
					}

					long var5 = DynamicObject.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5008
					var2.playerCycle = Client.cycle; // L: 5009
					GrandExchangeOfferOwnWorldComparator.scene.drawEntity(class113.Client_plane, var2.x, var2.y, class19.getTileHeight(var2.field1175 * 423432192 - 64 + var2.x, var2.field1175 * 423432192 - 64 + var2.y, class113.Client_plane), var2.field1175 * 423432192 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5010
				}
			}
		}

	} // L: 5014
}
