import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class148 extends class156 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 142574803
	)
	int field1672;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	final class157 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgk;)V"
	)
	class148(class157 var1) {
		this.this$0 = var1;
		this.field1672 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2070491057"
	)
	void vmethod3353(Buffer var1) {
		this.field1672 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-82"
	)
	void vmethod3354(ClanChannel var1) {
		var1.removeMember(this.field1672); // L: 96
	} // L: 97

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lrf;I)Ljava/lang/Object;",
		garbageValue = "556757847"
	)
	static Object method3171(class467 var0) {
		if (var0 == null) { // L: 5239
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5240
		} else {
			switch(var0.field4861) { // L: 5242
			case 0:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5246
			case 2:
				return Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 5244
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5248
			}
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[TaskHandler.Client_plane][var0][var1]; // L: 8184
		if (var2 == null) { // L: 8185
			class1.scene.removeGroundItemPile(TaskHandler.Client_plane, var0, var1); // L: 8186
		} else {
			long var3 = -99999999L; // L: 8189
			TileItem var5 = null; // L: 8190

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8191 8192 8202
				ItemComposition var7 = ParamComposition.ItemComposition_get(var6.id); // L: 8193
				long var11 = (long)var7.price; // L: 8194
				if (var7.isStackable == 1) { // L: 8195
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8196
				}

				if (var11 > var3) { // L: 8198
					var3 = var11; // L: 8199
					var5 = var6; // L: 8200
				}
			}

			if (var5 == null) { // L: 8204
				class1.scene.removeGroundItemPile(TaskHandler.Client_plane, var0, var1); // L: 8205
			} else {
				var2.addLast(var5); // L: 8208
				TileItem var13 = null; // L: 8209
				TileItem var8 = null; // L: 8210

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8211 8212 8217
					if (var5.id != var6.id) { // L: 8213
						if (var13 == null) { // L: 8214
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8215
							var8 = var6;
						}
					}
				}

				long var9 = class103.calculateTag(var0, var1, 3, false, 0); // L: 8219
				class1.scene.newGroundItemPile(TaskHandler.Client_plane, var0, var1, WorldMapDecorationType.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, TaskHandler.Client_plane), var5, var9, var13, var8); // L: 8220
			}
		}
	} // L: 8187 8206 8221

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;B)V",
		garbageValue = "3"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field607 = 0; // L: 8224
		Client.field539 = 0; // L: 8225
		var1.importIndex(); // L: 8227
		int var2 = var1.readBits(8); // L: 8228
		int var3;
		if (var2 < Client.npcCount) { // L: 8229
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8230
				Client.field608[++Client.field607 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8232
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8233

			for (var3 = 0; var3 < var2; ++var3) { // L: 8234
				int var4 = Client.npcIndices[var3]; // L: 8235
				NPC var5 = Client.npcs[var4]; // L: 8236
				int var6 = var1.readBits(1); // L: 8237
				if (var6 == 0) { // L: 8238
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8239
					var5.npcCycle = Client.cycle; // L: 8240
				} else {
					int var7 = var1.readBits(2); // L: 8243
					if (var7 == 0) { // L: 8244
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8245
						var5.npcCycle = Client.cycle; // L: 8246
						Client.field662[++Client.field539 - 1] = var4; // L: 8247
					} else {
						int var8;
						int var9;
						if (var7 == 1) { // L: 8250
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8251
							var5.npcCycle = Client.cycle; // L: 8252
							var8 = var1.readBits(3); // L: 8253
							var5.method2556(var8, class211.field2332); // L: 8254
							var9 = var1.readBits(1); // L: 8255
							if (var9 == 1) { // L: 8256
								Client.field662[++Client.field539 - 1] = var4;
							}
						} else if (var7 == 2) { // L: 8259
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8260
							var5.npcCycle = Client.cycle; // L: 8261
							if (var1.readBits(1) == 1) { // L: 8262
								var8 = var1.readBits(3); // L: 8263
								var5.method2556(var8, class211.field2335); // L: 8264
								var9 = var1.readBits(3); // L: 8265
								var5.method2556(var9, class211.field2335); // L: 8266
							} else {
								var8 = var1.readBits(3); // L: 8269
								var5.method2556(var8, class211.field2333); // L: 8270
							}

							var8 = var1.readBits(1); // L: 8272
							if (var8 == 1) { // L: 8273
								Client.field662[++Client.field539 - 1] = var4;
							}
						} else if (var7 == 3) { // L: 8276
							Client.field608[++Client.field607 - 1] = var4; // L: 8277
						}
					}
				}
			}

			class19.method281(var0, var1); // L: 8282
			class181.method3542(var1); // L: 8283

			for (var2 = 0; var2 < Client.field607; ++var2) { // L: 8284
				var3 = Client.field608[var2]; // L: 8285
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8286
					Client.npcs[var3].definition = null; // L: 8287
					Client.npcs[var3] = null; // L: 8288
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8291
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8292
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8294
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8295
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8296
					}
				}

			}
		}
	} // L: 8299
}
