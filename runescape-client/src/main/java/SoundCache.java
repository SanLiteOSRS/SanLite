import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1121856975
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laj;",
		garbageValue = "1563241146"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laj;",
		garbageValue = "-1588726679"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laj;",
		garbageValue = "1"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laj;",
		garbageValue = "1380052230"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfc;",
		garbageValue = "13903"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "0"
	)
	static int method803(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1183880843"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7795(class19.selectedItemSlot);
			var8.packetBuffer.method7795(selectedItemId);
			var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(ApproximateRouteStrategy.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method7746(PendingSpawn.selectedItemWidget);
			var8.packetBuffer.method7796(class250.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2894, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7796(Client.field688);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7791(class250.baseY * 64 + var1);
			var8.packetBuffer.method7796(Client.selectedSpellChildIndex);
			var8.packetBuffer.method7796(ApproximateRouteStrategy.baseX * 64 + var0);
			var8.packetBuffer.method7746(class92.selectedSpellWidget);
			var8.packetBuffer.method7795(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7796(class250.baseY * 64 + var1);
			var8.packetBuffer.method7795(ApproximateRouteStrategy.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
			var8.packetBuffer.method7791(var3);
			var8.packetBuffer.method7795(ApproximateRouteStrategy.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7796(ApproximateRouteStrategy.baseX * 64 + var0);
			var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
			var8.packetBuffer.method7796(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method7791(ApproximateRouteStrategy.baseX * 64 + var0);
			var8.packetBuffer.method7796(var3);
			var8.packetBuffer.method7796(class250.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7795(var3);
					var9.packetBuffer.method7807(PendingSpawn.selectedItemWidget);
					var9.packetBuffer.method7791(selectedItemId);
					var9.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7796(class19.selectedItemSlot);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method7795(var3);
					var9.packetBuffer.method7806(class92.selectedSpellWidget);
					var9.packetBuffer.method7796(Client.field688);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7795(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7795(var3);
					var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7795(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7795(var3);
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7791(selectedItemId);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method7796(class19.selectedItemSlot);
						var9.packetBuffer.method7807(PendingSpawn.selectedItemWidget);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method7795(Client.selectedSpellChildIndex);
						var9.packetBuffer.method7796(var3);
						var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeInt(class92.selectedSpellWidget);
						var9.packetBuffer.writeShort(Client.field688);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2900, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7796(class19.selectedItemSlot);
					var8.packetBuffer.method7796(var3);
					var8.packetBuffer.method7796(ApproximateRouteStrategy.baseX * 64 + var0);
					var8.packetBuffer.method7791(class250.baseY * 64 + var1);
					var8.packetBuffer.method7807(PendingSpawn.selectedItemWidget);
					var8.packetBuffer.writeShort(selectedItemId);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2942, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(Client.field688);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7795(var3);
					var8.packetBuffer.writeInt(class92.selectedSpellWidget);
					var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var8.packetBuffer.method7796(ApproximateRouteStrategy.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7791(var3);
					var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
					var8.packetBuffer.method7795(ApproximateRouteStrategy.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
					var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7795(ApproximateRouteStrategy.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7795(ApproximateRouteStrategy.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7796(class250.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(ApproximateRouteStrategy.baseX * 64 + var0);
					var8.packetBuffer.method7791(class250.baseY * 64 + var1);
					var8.packetBuffer.method7791(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7791(ApproximateRouteStrategy.baseX * 64 + var0);
					var8.packetBuffer.method7795(class250.baseY * 64 + var1);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						FriendSystem.scene.setViewportWalking();
					} else {
						FriendSystem.scene.menuOpen(class160.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = HorizontalAlignment.getWidget(var1);
						boolean var11 = true;
						if (var16.contentType > 0) {
							var11 = Frames.method4319(var16);
						}

						if (var11) {
							var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = class143.getWidgetChild(var1, var0);
							if (var16 != null) {
								class120.Widget_runOnTargetLeave();
								ApproximateRouteStrategy.selectSpell(var1, var0, WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = InvDefinition.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + ChatChannel.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = ChatChannel.colorStartTag(65280) + var16.spellName + ChatChannel.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class9.method85();
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = HorizontalAlignment.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12];
									class78.changeGameOptions(var12);
								}
							} else if (var2 == 29) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = HorizontalAlignment.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var12 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0];
										class78.changeGameOptions(var12);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									Messages.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class143.getWidgetChild(var1, var0);
									class290.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7807(PendingSpawn.selectedItemWidget);
								var8.packetBuffer.method7795(class19.selectedItemSlot);
								var8.packetBuffer.method7806(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method7795(selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 32) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7796(var3);
								var8.packetBuffer.method7807(class92.selectedSpellWidget);
								var8.packetBuffer.method7796(var0);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 33) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method7806(var1);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 34) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7806(var1);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 35) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method7806(var1);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 36) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7795(var3);
								var8.packetBuffer.method7806(var1);
								var8.packetBuffer.method7791(var0);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else if (var2 == 37) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7807(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method7791(var0);
								Client.packetWriter.addNode(var8);
								Client.field595 = 0;
								class12.field64 = HorizontalAlignment.getWidget(var1);
								Client.field741 = var0;
							} else {
								if (var2 == 38) {
									class120.Widget_runOnTargetLeave();
									var16 = HorizontalAlignment.getWidget(var1);
									Client.isItemSelected = 1;
									class19.selectedItemSlot = var0;
									PendingSpawn.selectedItemWidget = var1;
									selectedItemId = var3;
									class290.invalidateWidget(var16);
									Client.selectedItemName = ChatChannel.colorStartTag(16748608) + class67.ItemComposition_get(var3).name + ChatChannel.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method7796(var0);
									var8.packetBuffer.method7795(var3);
									Client.packetWriter.addNode(var8);
									Client.field595 = 0;
									class12.field64 = HorizontalAlignment.getWidget(var1);
									Client.field741 = var0;
								} else if (var2 == 40) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7807(var1);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method7796(var3);
									Client.packetWriter.addNode(var8);
									Client.field595 = 0;
									class12.field64 = HorizontalAlignment.getWidget(var1);
									Client.field741 = var0;
								} else if (var2 == 41) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7796(var3);
									var8.packetBuffer.method7806(var1);
									var8.packetBuffer.method7791(var0);
									Client.packetWriter.addNode(var8);
									Client.field595 = 0;
									class12.field64 = HorizontalAlignment.getWidget(var1);
									Client.field741 = var0;
								} else if (var2 == 42) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7791(var0);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method7795(var3);
									Client.packetWriter.addNode(var8);
									Client.field595 = 0;
									class12.field64 = HorizontalAlignment.getWidget(var1);
									Client.field741 = var0;
								} else if (var2 == 43) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2895, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7791(var0);
									var8.packetBuffer.method7791(var3);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field595 = 0;
									class12.field64 = HorizontalAlignment.getWidget(var1);
									Client.field741 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7795(var3);
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7795(var3);
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7796(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2903, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7791(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7791(var3);
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label638: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = class143.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeShort(Client.field688);
													var9.packetBuffer.method7807(class92.selectedSpellWidget);
													var9.packetBuffer.method7796(var16.itemId);
													var9.packetBuffer.method7791(Client.selectedSpellChildIndex);
													var9.packetBuffer.writeInt(var1);
													var9.packetBuffer.method7796(var0);
													Client.packetWriter.addNode(var9);
												}
												break label638;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7795(var3);
												var8.packetBuffer.method7796(ApproximateRouteStrategy.baseX * 64 + var0);
												var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.writeShort(class250.baseY * 64 + var1);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7791(var3);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var13 = Client.npcs[var3];
												if (var13 != null) {
													NPCComposition var17 = var13.definition;
													if (var17.transforms != null) {
														var17 = var17.transform();
													}

													if (var17 != null) {
														var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher);
														var10.packetBuffer.method7795(var17.id);
														Client.packetWriter.addNode(var10);
													}
												}
												break label638;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7796(var3);
												Client.packetWriter.addNode(var8);
												break label638;
											}

											if (var2 == 1005) {
												var16 = HorizontalAlignment.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													Login.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class67.ItemComposition_get(var3).name);
												} else {
													var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method7796(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field595 = 0;
												class12.field64 = HorizontalAlignment.getWidget(var1);
												Client.field741 = var0;
												break label638;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1009 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
													ClanChannel.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label638;
											}
										}

										var16 = class143.getWidgetChild(var1, var0);
										if (var16 != null) {
											Message.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			class290.invalidateWidget(HorizontalAlignment.getWidget(PendingSpawn.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class120.Widget_runOnTargetLeave();
		}

		if (class12.field64 != null && Client.field595 == 0) {
			class290.invalidateWidget(class12.field64);
		}

	}
}
