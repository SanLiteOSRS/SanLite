import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lii;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -974812285
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 218820245
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("an")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -920955831
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		int var8 = var7.length; // L: 23
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) { // L: 25
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 26
			this.textures[var7[var9]] = new Texture(var10); // L: 27
		}

	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-848273151"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds; // L: 42

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method6436(var8)) { // L: 46
						++var2; // L: 47
					}
				}
			}
		}

		if (var1 == 0) { // L: 55
			return 0;
		} else {
			return var2 * 100 / var1; // L: 56
		}
	}

	@ObfuscatedName("al")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "599010973"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 65
		if (var2 != null) { // L: 66
			if (var2.pixels != null) { // L: 67
				this.deque.addLast(var2); // L: 68
				var2.isLoaded = true; // L: 69
				return var2.pixels; // L: 70
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 72
			if (var3) { // L: 73
				if (this.remaining == 0) { // L: 74
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 75
					var4.reset(); // L: 76
				} else {
					--this.remaining; // L: 78
				}

				this.deque.addLast(var2); // L: 79
				var2.isLoaded = true; // L: 80
				return var2.pixels; // L: 81
			}
		}

		return null; // L: 84
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-1822"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2046582382"
	)
	public boolean vmethod4757(int var1) {
		return this.textures[var1].field2423; // L: 93
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1479518028"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "19136782"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "888042879"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9733
			class110.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9734
		}

		long var4 = -1L; // L: 9737
		long var6 = -1L; // L: 9738

		int var8;
		for (var8 = 0; var8 < class196.method3752(); ++var8) { // L: 9739
			long var23 = class166.method3384(var8); // L: 9740
			if (var23 != var6) { // L: 9741
				var6 = var23; // L: 9742
				int var25 = class132.method3036(var8); // L: 9743
				int var12 = class211.method4150(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9746
				int var13 = var12; // L: 9748
				long var16 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9752
				int var15 = (int)(var16 >>> 14 & 3L); // L: 9754
				int var26 = class11.method100(var8); // L: 9759
				int var20;
				if (var15 == 2 && class1.scene.getObjectFlags(TaskHandler.Client_plane, var25, var12, var23) >= 0) { // L: 9760 9761
					ObjectComposition var17 = DecorativeObject.getObjectDefinition(var26); // L: 9762
					if (var17.transforms != null) { // L: 9763
						var17 = var17.transform();
					}

					if (var17 == null) { // L: 9764
						continue;
					}

					PendingSpawn var18 = null; // L: 9765

					for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 9766
						if (var19.plane == TaskHandler.Client_plane && var25 == var19.x && var13 == var19.y && var26 == var19.field1135) { // L: 9767
							var18 = var19; // L: 9768
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 9772
						class110.insertMenuItemNoShift("Use", Client.field640 + " " + "->" + " " + Canvas.colorStartTag(65535) + var17.name, 1, var26, var25, var13); // L: 9773
					} else if (Client.isSpellSelected) { // L: 9776
						if ((class90.selectedSpellFlags & 4) == 4) { // L: 9777
							class110.insertMenuItemNoShift(Client.field711, Client.field645 + " " + "->" + " " + Canvas.colorStartTag(65535) + var17.name, 2, var26, var25, var13); // L: 9778
						}
					} else {
						String[] var34 = var17.actions; // L: 9783
						if (var34 != null) { // L: 9784
							for (var20 = 4; var20 >= 0; --var20) { // L: 9785
								if ((var18 == null || var18.method2345(var20)) && var34[var20] != null) { // L: 9786 9787
									short var21 = 0; // L: 9788
									if (var20 == 0) { // L: 9789
										var21 = 3;
									}

									if (var20 == 1) { // L: 9790
										var21 = 4;
									}

									if (var20 == 2) { // L: 9791
										var21 = 5;
									}

									if (var20 == 3) { // L: 9792
										var21 = 6;
									}

									if (var20 == 4) { // L: 9793
										var21 = 1001;
									}

									class110.insertMenuItemNoShift(var34[var20], Canvas.colorStartTag(65535) + var17.name, var21, var26, var25, var13); // L: 9794
								}
							}
						}

						class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var13); // L: 9799
					}
				}

				int var27;
				Player var28;
				NPC var35;
				int[] var36;
				if (var15 == 1) { // L: 9804
					NPC var30 = Client.npcs[var26]; // L: 9805
					if (var30 == null) { // L: 9806
						continue;
					}

					if (var30.definition.size == 1 && (var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 9807
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9808
							var35 = Client.npcs[Client.npcIndices[var27]]; // L: 9809
							if (var35 != null && var35 != var30 && var35.definition.size == 1 && var35.x == var30.x && var35.y == var30.y) { // L: 9810
								class260.addNpcToMenu(var35, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count; // L: 9812
						var36 = Players.Players_indices; // L: 9813

						for (var20 = 0; var20 < var27; ++var20) { // L: 9814
							var28 = Client.players[var36[var20]]; // L: 9815
							if (var28 != null && var30.x == var28.x && var30.y == var28.y) { // L: 9816
								class16.addPlayerToMenu(var28, var36[var20], var25, var13);
							}
						}
					}

					class260.addNpcToMenu(var30, var26, var25, var13); // L: 9819
				}

				if (var15 == 0) { // L: 9821
					Player var31 = Client.players[var26]; // L: 9822
					if (var31 == null) { // L: 9823
						continue;
					}

					if ((var31.x & 127) == 64 && (var31.y & 127) == 64) { // L: 9824
						for (var27 = 0; var27 < Client.npcCount; ++var27) { // L: 9825
							var35 = Client.npcs[Client.npcIndices[var27]]; // L: 9826
							if (var35 != null && var35.definition.size == 1 && var35.x == var31.x && var35.y == var31.y) { // L: 9827
								class260.addNpcToMenu(var35, Client.npcIndices[var27], var25, var13);
							}
						}

						var27 = Players.Players_count; // L: 9829
						var36 = Players.Players_indices; // L: 9830

						for (var20 = 0; var20 < var27; ++var20) { // L: 9831
							var28 = Client.players[var36[var20]]; // L: 9832
							if (var28 != null && var31 != var28 && var31.x == var28.x && var28.y == var31.y) { // L: 9833
								class16.addPlayerToMenu(var28, var36[var20], var25, var13);
							}
						}
					}

					if (var26 != Client.combatTargetPlayerIndex) { // L: 9836
						class16.addPlayerToMenu(var31, var26, var25, var13);
					} else {
						var4 = var23; // L: 9837
					}
				}

				if (var15 == 3) { // L: 9839
					NodeDeque var32 = Client.groundItems[TaskHandler.Client_plane][var25][var13]; // L: 9840
					if (var32 != null) { // L: 9841
						for (TileItem var33 = (TileItem)var32.first(); var33 != null; var33 = (TileItem)var32.next()) { // L: 9842 9843 9877
							ItemComposition var37 = ParamComposition.ItemComposition_get(var33.id); // L: 9844
							if (Client.isItemSelected == 1) { // L: 9845
								class110.insertMenuItemNoShift("Use", Client.field640 + " " + "->" + " " + Canvas.colorStartTag(16748608) + var37.name, 16, var33.id, var25, var13); // L: 9846
							} else if (Client.isSpellSelected) { // L: 9849
								if ((class90.selectedSpellFlags & 1) == 1) { // L: 9850
									class110.insertMenuItemNoShift(Client.field711, Client.field645 + " " + "->" + " " + Canvas.colorStartTag(16748608) + var37.name, 17, var33.id, var25, var13); // L: 9851
								}
							} else {
								String[] var29 = var37.groundActions; // L: 9856

								for (int var38 = 4; var38 >= 0; --var38) { // L: 9857
									if (var33.method2651(var38)) { // L: 9858
										if (var29 != null && var29[var38] != null) { // L: 9859
											byte var22 = 0; // L: 9860
											if (var38 == 0) { // L: 9861
												var22 = 18;
											}

											if (var38 == 1) { // L: 9862
												var22 = 19;
											}

											if (var38 == 2) { // L: 9863
												var22 = 20;
											}

											if (var38 == 3) { // L: 9864
												var22 = 21;
											}

											if (var38 == 4) { // L: 9865
												var22 = 22;
											}

											class110.insertMenuItemNoShift(var29[var38], Canvas.colorStartTag(16748608) + var37.name, var22, var33.id, var25, var13); // L: 9866
										} else if (var38 == 2) { // L: 9869
											class110.insertMenuItemNoShift("Take", Canvas.colorStartTag(16748608) + var37.name, 20, var33.id, var25, var13); // L: 9870
										}
									}
								}

								class110.insertMenuItemNoShift("Examine", Canvas.colorStartTag(16748608) + var37.name, 1004, var33.id, var25, var13); // L: 9874
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9882
			var8 = (int)(var4 >>> 0 & 127L); // L: 9885
			int var10 = class211.method4150(var4); // L: 9888
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9889
			class16.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9890
		}

	} // L: 9892
}
