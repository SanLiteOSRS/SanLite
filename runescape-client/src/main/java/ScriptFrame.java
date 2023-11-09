import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = 1496735347
	)
	static int field469;
	@ObfuscatedName("bc")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1780087085
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("aw")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ac")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1705605824"
	)
	public static int method1167(int var0) {
		return NPCComposition.method3824(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 77
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1708655552"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9676
			MenuAction.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9677
		}

		long var4 = -1L; // L: 9680
		long var6 = -1L; // L: 9681

		int var8;
		for (var8 = 0; var8 < class25.method389(); ++var8) { // L: 9682
			long var23 = class30.method465(var8); // L: 9683
			if (var6 != var23) { // L: 9684
				var6 = var23; // L: 9685
				int var25 = FaceNormal.method4704(var8); // L: 9686
				int var12 = method1167(var8); // L: 9687
				int var13 = TextureProvider.method4736(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9690
				int var15 = InterfaceParent.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9695
				int var16 = var15; // L: 9697
				int var20;
				if (var13 == 2 && class31.scene.getObjectFlags(GameEngine.Client_plane, var25, var12, var23) >= 0) { // L: 9698 9699
					ObjectComposition var17 = class144.getObjectDefinition(var15); // L: 9700
					if (var17.transforms != null) { // L: 9701
						var17 = var17.transform();
					}

					if (var17 == null) { // L: 9702
						continue;
					}

					PendingSpawn var18 = null; // L: 9703

					for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 9704
						if (var19.plane == GameEngine.Client_plane && var25 == var19.x && var12 == var19.y && var16 == var19.field1127) { // L: 9705
							var18 = var19; // L: 9706
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 9710
						MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(65535) + var17.name, 1, var16, var25, var12); // L: 9711
					} else if (Client.isSpellSelected) { // L: 9714
						if ((SecureRandomFuture.selectedSpellFlags & 4) == 4) { // L: 9715
							MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(65535) + var17.name, 2, var16, var25, var12); // L: 9716
						}
					} else {
						String[] var33 = var17.actions; // L: 9721
						if (var33 != null) { // L: 9722
							for (var20 = 4; var20 >= 0; --var20) { // L: 9723
								if ((var18 == null || var18.method2362(var20)) && var33[var20] != null) { // L: 9724 9725
									short var21 = 0; // L: 9726
									if (var20 == 0) { // L: 9727
										var21 = 3;
									}

									if (var20 == 1) { // L: 9728
										var21 = 4;
									}

									if (var20 == 2) { // L: 9729
										var21 = 5;
									}

									if (var20 == 3) { // L: 9730
										var21 = 6;
									}

									if (var20 == 4) { // L: 9731
										var21 = 1001;
									}

									MenuAction.insertMenuItemNoShift(var33[var20], class383.colorStartTag(65535) + var17.name, var21, var16, var25, var12); // L: 9732
								}
							}
						}

						MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(65535) + var17.name, 1002, var17.id, var25, var12); // L: 9737
					}
				}

				int var26;
				Player var27;
				NPC var34;
				int[] var35;
				if (var13 == 1) { // L: 9742
					NPC var29 = Client.npcs[var16]; // L: 9743
					if (var29 == null) { // L: 9744
						continue;
					}

					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 9745
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 9746
							var34 = Client.npcs[Client.npcIndices[var26]]; // L: 9747
							if (var34 != null && var29 != var34 && var34.definition.size == 1 && var29.x == var34.x && var29.y == var34.y) { // L: 9748
								InvDefinition.addNpcToMenu(var34, Client.npcIndices[var26], var25, var12);
							}
						}

						var26 = Players.Players_count; // L: 9750
						var35 = Players.Players_indices; // L: 9751

						for (var20 = 0; var20 < var26; ++var20) { // L: 9752
							var27 = Client.players[var35[var20]]; // L: 9753
							if (var27 != null && var27.x == var29.x && var27.y == var29.y) { // L: 9754
								DynamicObject.addPlayerToMenu(var27, var35[var20], var25, var12);
							}
						}
					}

					InvDefinition.addNpcToMenu(var29, var16, var25, var12); // L: 9757
				}

				if (var13 == 0) { // L: 9759
					Player var30 = Client.players[var16]; // L: 9760
					if (var30 == null) { // L: 9761
						continue;
					}

					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 9762
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 9763
							var34 = Client.npcs[Client.npcIndices[var26]]; // L: 9764
							if (var34 != null && var34.definition.size == 1 && var30.x == var34.x && var34.y == var30.y) { // L: 9765
								InvDefinition.addNpcToMenu(var34, Client.npcIndices[var26], var25, var12);
							}
						}

						var26 = Players.Players_count; // L: 9767
						var35 = Players.Players_indices; // L: 9768

						for (var20 = 0; var20 < var26; ++var20) { // L: 9769
							var27 = Client.players[var35[var20]]; // L: 9770
							if (var27 != null && var30 != var27 && var30.x == var27.x && var27.y == var30.y) { // L: 9771
								DynamicObject.addPlayerToMenu(var27, var35[var20], var25, var12);
							}
						}
					}

					if (var16 != Client.combatTargetPlayerIndex) { // L: 9774
						DynamicObject.addPlayerToMenu(var30, var16, var25, var12);
					} else {
						var4 = var23; // L: 9775
					}
				}

				if (var13 == 3) { // L: 9777
					NodeDeque var31 = Client.groundItems[GameEngine.Client_plane][var25][var12]; // L: 9778
					if (var31 != null) { // L: 9779
						for (TileItem var32 = (TileItem)var31.first(); var32 != null; var32 = (TileItem)var31.next()) { // L: 9780 9781 9815
							ItemComposition var36 = HealthBarUpdate.ItemComposition_get(var32.id); // L: 9782
							if (Client.isItemSelected == 1) { // L: 9783
								MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16748608) + var36.name, 16, var32.id, var25, var12); // L: 9784
							} else if (Client.isSpellSelected) { // L: 9787
								if ((SecureRandomFuture.selectedSpellFlags & 1) == 1) { // L: 9788
									MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16748608) + var36.name, 17, var32.id, var25, var12); // L: 9789
								}
							} else {
								String[] var28 = var36.groundActions; // L: 9794

								for (int var37 = 4; var37 >= 0; --var37) { // L: 9795
									if (var32.method2671(var37)) { // L: 9796
										if (var28 != null && var28[var37] != null) { // L: 9797
											byte var22 = 0; // L: 9798
											if (var37 == 0) { // L: 9799
												var22 = 18;
											}

											if (var37 == 1) { // L: 9800
												var22 = 19;
											}

											if (var37 == 2) { // L: 9801
												var22 = 20;
											}

											if (var37 == 3) { // L: 9802
												var22 = 21;
											}

											if (var37 == 4) { // L: 9803
												var22 = 22;
											}

											MenuAction.insertMenuItemNoShift(var28[var37], class383.colorStartTag(16748608) + var36.name, var22, var32.id, var25, var12); // L: 9804
										} else if (var37 == 2) { // L: 9807
											MenuAction.insertMenuItemNoShift("Take", class383.colorStartTag(16748608) + var36.name, 20, var32.id, var25, var12); // L: 9808
										}
									}
								}

								MenuAction.insertMenuItemNoShift("Examine", class383.colorStartTag(16748608) + var36.name, 1004, var32.id, var25, var12); // L: 9812
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) { // L: 9820
			var8 = (int)(var4 >>> 0 & 127L); // L: 9823
			int var10 = NPCComposition.method3824(var4); // L: 9826
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9827
			DynamicObject.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9828
		}

	} // L: 9830

	@ObfuscatedName("mg")
	static final void method1164(double var0) {
		class18.method285(var0); // L: 11651
		((TextureProvider)Rasterizer3D.field2514.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11652
		class127.method3118(); // L: 11653
		class20.clientPreferences.method2458(var0); // L: 11654
	} // L: 11655

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-42"
	)
	static void method1166(String var0) {
		class108.field1403 = var0; // L: 12093

		try {
			String var1 = client.getParameter(Integer.toString(18)); // L: 12095
			String var2 = client.getParameter(Integer.toString(13)); // L: 12096
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12097
			if (var0.length() == 0) { // L: 12098
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class136.method3194(class96.method2634() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12099
			}

			class26.method392(client, "document.cookie=\"" + var3 + "\""); // L: 12100
		} catch (Throwable var4) { // L: 12102
		}

	} // L: 12103
}
