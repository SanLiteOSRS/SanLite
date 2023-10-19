import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class432 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lng;",
		garbageValue = "-17"
	)
	public static GameBuild method7855(int var0) {
		GameBuild[] var1 = class209.method3850(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lte;I)Ljava/lang/String;",
		garbageValue = "1990083355"
	)
	public static String method7856(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 40
			return null;
		} else {
			int var2 = 0; // L: 41

			int var3;
			for (var3 = var0.length(); var2 < var3 && DevicePcmPlayerProvider.method313(var0.charAt(var2)); ++var2) { // L: 42 43
			}

			while (var3 > var2 && DevicePcmPlayerProvider.method313(var0.charAt(var3 - 1))) { // L: 44
				--var3;
			}

			int var4 = var3 - var2; // L: 45
			if (var4 >= 1) { // L: 47
				byte var6;
				if (var1 == null) { // L: 51
					var6 = 12; // L: 52
				} else {
					switch(var1.field5036) { // L: 55
					case 8:
						var6 = 20; // L: 57
						break; // L: 58
					default:
						var6 = 12; // L: 60
					}
				}

				if (var4 <= var6) { // L: 64
					StringBuilder var10 = new StringBuilder(var4); // L: 68

					for (int var11 = var2; var11 < var3; ++var11) { // L: 69
						char var7 = var0.charAt(var11); // L: 70
						if (class410.method7606(var7)) { // L: 71
							char var8;
							switch(var7) { // L: 74
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_'; // L: 130
								break; // L: 131
							case '#':
							case '[':
							case ']':
								var8 = var7; // L: 114
								break; // L: 115
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a'; // L: 142
								break; // L: 143
							case 'Ç':
							case 'ç':
								var8 = 'c'; // L: 89
								break; // L: 90
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e'; // L: 106
								break; // L: 107
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i'; // L: 154
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n'; // L: 146
								break; // L: 147
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o'; // L: 85
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u'; // L: 124
								break; // L: 125
							case 'ß':
								var8 = 'b'; // L: 109
								break; // L: 110
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y'; // L: 96
								break; // L: 97
							default:
								var8 = Character.toLowerCase(var7); // L: 92
							}

							if (var8 != 0) { // L: 159
								var10.append(var8); // L: 160
							}
						}
					}

					if (var10.length() == 0) { // L: 162
						return null;
					}

					return var10.toString(); // L: 163
				}
			}

			return null; // L: 66
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1639340549"
	)
	static final int method7853(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 933
		int var4 = var0 & var2 - 1; // L: 934
		int var5 = var1 / var2; // L: 935
		int var6 = var1 & var2 - 1; // L: 936
		int var7 = Login.method2140(var3, var5); // L: 937
		int var8 = Login.method2140(var3 + 1, var5); // L: 938
		int var9 = Login.method2140(var3, var5 + 1); // L: 939
		int var10 = Login.method2140(var3 + 1, var5 + 1); // L: 940
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 943
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 944
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 949
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 950
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 955
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16); // L: 956
		return var15; // L: 958
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2048863537"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4819
		if (TextureProvider.localPlayer.x >> 7 == Client.destinationX && TextureProvider.localPlayer.y >> 7 == Client.destinationY) { // L: 4821
			Client.destinationX = 0; // L: 4822
		}

		if (Client.field648) { // L: 4826
			class199.addPlayerToScene(TextureProvider.localPlayer, false); // L: 4827
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4831
			class199.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4832
		}

		TileItem.addNpcsToScene(true); // L: 4835
		WorldMapArchiveLoader.method8643(); // L: 4836
		TileItem.addNpcsToScene(false); // L: 4837
		class471.method8460(); // L: 4838

		for (GraphicsObject var4 = (GraphicsObject)Client.graphicsObjects.last(); var4 != null; var4 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4840 4841 4848
			if (var4.plane == class87.Client_plane && !var4.isFinished) { // L: 4842
				if (Client.cycle >= var4.cycleStart) { // L: 4843
					var4.advance(Client.field709); // L: 4844
					if (var4.isFinished) { // L: 4845
						var4.remove();
					} else {
						class10.scene.drawEntity(var4.plane, var4.x, var4.y, var4.z, 60, var4, 0, -1L, false); // L: 4846
					}
				}
			} else {
				var4.remove();
			}
		}

		class53.setViewportShape(var0, var1, var2, var3, true); // L: 4851
		var0 = Client.viewportOffsetX; // L: 4852
		var1 = Client.viewportOffsetY; // L: 4853
		var2 = Client.viewportWidth; // L: 4854
		var3 = Client.viewportHeight; // L: 4855
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4856
		Rasterizer3D.method4535(); // L: 4857
		Rasterizer2D.method9547(); // L: 4858
		int var37 = Client.camAngleX; // L: 4859
		if (Client.field621 / 256 > var37) { // L: 4860
			var37 = Client.field621 / 256;
		}

		if (Client.field786[4] && Client.field680[4] + 128 > var37) { // L: 4861
			var37 = Client.field680[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4862
		int var6 = ChatChannel.oculusOrbFocalPointX; // L: 4863
		int var7 = class433.field4639; // L: 4864
		int var8 = AbstractWorldMapData.oculusOrbFocalPointY; // L: 4865
		int var9 = var37 * 3 + 600; // L: 4868
		int var12 = var3 - 334; // L: 4874
		if (var12 < 0) { // L: 4875
			var12 = 0;
		} else if (var12 > 100) { // L: 4876
			var12 = 100;
		}

		int var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight; // L: 4877
		int var11 = var13 * var9 / 256; // L: 4878
		var12 = 2048 - var37 & 2047; // L: 4881
		var13 = 2048 - var5 & 2047; // L: 4882
		int var14 = 0; // L: 4883
		int var15 = 0; // L: 4884
		int var16 = var11; // L: 4885
		int var17;
		int var18;
		int var19;
		if (var12 != 0) { // L: 4886
			var17 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4887
			var18 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4888
			var19 = var18 * var15 - var17 * var11 >> 16; // L: 4889
			var16 = var18 * var11 + var15 * var17 >> 16; // L: 4890
			var15 = var19; // L: 4891
		}

		if (var13 != 0) { // L: 4893
			var17 = Rasterizer3D.Rasterizer3D_sine[var13]; // L: 4894
			var18 = Rasterizer3D.Rasterizer3D_cosine[var13]; // L: 4895
			var19 = var17 * var16 + var14 * var18 >> 16; // L: 4896
			var16 = var18 * var16 - var14 * var17 >> 16; // L: 4897
			var14 = var19; // L: 4898
		}

		if (Client.isCameraLocked) { // L: 4900
			AbstractUserComparator.field4701 = var6 - var14; // L: 4901
			TriBool.field4718 = var7 - var15; // L: 4902
			JagexCache.field1844 = var8 - var16; // L: 4903
			class14.field76 = var37; // L: 4904
			GrandExchangeOfferOwnWorldComparator.field516 = var5; // L: 4905
		} else {
			Client.cameraX = var6 - var14; // L: 4908
			class17.cameraY = var7 - var15; // L: 4909
			WorldMapArea.cameraZ = var8 - var16; // L: 4910
			class365.cameraPitch = var37; // L: 4911
			DecorativeObject.cameraYaw = var5; // L: 4912
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ChatChannel.oculusOrbFocalPointX >> 7 != TextureProvider.localPlayer.x >> 7 || AbstractWorldMapData.oculusOrbFocalPointY >> 7 != TextureProvider.localPlayer.y >> 7)) { // L: 4914 4915
			var17 = TextureProvider.localPlayer.plane; // L: 4916
			var18 = class20.baseX * 64 + (ChatChannel.oculusOrbFocalPointX >> 7); // L: 4917
			var19 = class19.baseY * 64 + (AbstractWorldMapData.oculusOrbFocalPointY >> 7); // L: 4918
			PacketBufferNode var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 4921
			var20.packetBuffer.method9243(var18); // L: 4922
			var20.packetBuffer.method9344(var19); // L: 4923
			var20.packetBuffer.writeInt(Client.field547); // L: 4924
			var20.packetBuffer.method9323(var17); // L: 4925
			Client.packetWriter.addNode(var20); // L: 4926
		}

		if (!Client.isCameraLocked) { // L: 4932
			var11 = class136.method3078();
		} else {
			var11 = class232.method4410(); // L: 4933
		}

		var12 = Client.cameraX; // L: 4934
		var13 = class17.cameraY; // L: 4935
		var14 = WorldMapArea.cameraZ; // L: 4936
		var15 = class365.cameraPitch; // L: 4937
		var16 = DecorativeObject.cameraYaw; // L: 4938

		for (var17 = 0; var17 < 5; ++var17) { // L: 4939
			if (Client.field786[var17]) { // L: 4940
				var18 = (int)(Math.random() * (double)(Client.field787[var17] * 2 + 1) - (double)Client.field787[var17] + Math.sin((double)Client.field707[var17] * ((double)Client.field789[var17] / 100.0D)) * (double)Client.field680[var17]); // L: 4941
				if (var17 == 0) { // L: 4942
					Client.cameraX += var18;
				}

				if (var17 == 1) { // L: 4943
					class17.cameraY += var18;
				}

				if (var17 == 2) { // L: 4944
					WorldMapArea.cameraZ += var18;
				}

				if (var17 == 3) { // L: 4945
					DecorativeObject.cameraYaw = var18 + DecorativeObject.cameraYaw & 2047;
				}

				if (var17 == 4) { // L: 4946
					class365.cameraPitch += var18; // L: 4947
					if (class365.cameraPitch < 128) { // L: 4948
						class365.cameraPitch = 128;
					}

					if (class365.cameraPitch > 383) { // L: 4949
						class365.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x; // L: 4953
		var18 = MouseHandler.MouseHandler_y; // L: 4954
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4955
			var17 = MouseHandler.MouseHandler_lastPressedX; // L: 4956
			var18 = MouseHandler.MouseHandler_lastPressedY; // L: 4957
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) { // L: 4959
			class16.method197(var17 - var0, var18 - var1); // L: 4960
		} else {
			SpotAnimationDefinition.method3868(); // L: 4963
		}

		class313.method5891(); // L: 4965
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4966
		class313.method5891(); // L: 4967
		var19 = Rasterizer3D.method4528(); // L: 4968
		Rasterizer3D.method4518(class159.client.field190); // L: 4969
		Rasterizer3D.field2550.field2830 = Client.viewportZoom; // L: 4970
		class10.scene.draw(Client.cameraX, class17.cameraY, WorldMapArea.cameraZ, class365.cameraPitch, DecorativeObject.cameraYaw, var11); // L: 4971
		Rasterizer3D.method4518(false); // L: 4972
		if (Client.renderSelf) { // L: 4973
			Rasterizer2D.method9539(); // L: 4974
		}

		Rasterizer3D.field2550.field2830 = var19; // L: 4976
		class313.method5891(); // L: 4977
		class10.scene.clearTempGameObjects(); // L: 4978
		Client.field617 = 0; // L: 4980
		boolean var38 = false; // L: 4981
		int var21 = -1; // L: 4982
		int var22 = -1; // L: 4983
		int var23 = Players.Players_count; // L: 4984
		int[] var24 = Players.Players_indices; // L: 4985

		int var25;
		for (var25 = 0; var25 < var23 + Client.npcCount; ++var25) { // L: 4986
			Object var40;
			if (var25 < var23) { // L: 4988
				var40 = Client.players[var24[var25]]; // L: 4989
				if (var24[var25] == Client.combatTargetPlayerIndex) { // L: 4990
					var38 = true; // L: 4991
					var21 = var25; // L: 4992
					continue;
				}

				if (var40 == TextureProvider.localPlayer) { // L: 4995
					var22 = var25; // L: 4996
					continue; // L: 4997
				}
			} else {
				var40 = Client.npcs[Client.npcIndices[var25 - var23]]; // L: 5000
			}

			class232.drawActor2d((Actor)var40, var25, var0, var1, var2, var3); // L: 5001
		}

		if (Client.field648 && var22 != -1) { // L: 5003
			class232.drawActor2d(TextureProvider.localPlayer, var22, var0, var1, var2, var3); // L: 5004
		}

		if (var38) { // L: 5006
			class232.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3); // L: 5007
		}

		for (var25 = 0; var25 < Client.field617; ++var25) { // L: 5009
			int var26 = Client.field624[var25]; // L: 5010
			int var27 = Client.field625[var25]; // L: 5011
			int var28 = Client.field627[var25]; // L: 5012
			int var29 = Client.field626[var25]; // L: 5013
			boolean var30 = true; // L: 5014

			while (var30) {
				var30 = false; // L: 5016

				for (int var39 = 0; var39 < var25; ++var39) { // L: 5017
					if (var27 + 2 > Client.field625[var39] - Client.field626[var39] && var27 - var29 < Client.field625[var39] + 2 && var26 - var28 < Client.field627[var39] + Client.field624[var39] && var28 + var26 > Client.field624[var39] - Client.field627[var39] && Client.field625[var39] - Client.field626[var39] < var27) { // L: 5018 5019
						var27 = Client.field625[var39] - Client.field626[var39]; // L: 5020
						var30 = true; // L: 5021
					}
				}
			}

			Client.viewportTempX = Client.field624[var25]; // L: 5026
			Client.viewportTempY = Client.field625[var25] = var27; // L: 5027
			String var31 = Client.field632[var25]; // L: 5028
			if (Client.chatEffects == 0) { // L: 5029
				int var32 = 16776960; // L: 5030
				if (Client.field628[var25] < 6) { // L: 5031
					var32 = Client.field749[Client.field628[var25]];
				}

				if (Client.field628[var25] == 6) { // L: 5032
					var32 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field628[var25] == 7) { // L: 5033
					var32 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field628[var25] == 8) { // L: 5034
					var32 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var33;
				if (Client.field628[var25] == 9) { // L: 5035
					var33 = 150 - Client.field733[var25]; // L: 5036
					if (var33 < 50) { // L: 5037
						var32 = var33 * 1280 + 16711680;
					} else if (var33 < 100) { // L: 5038
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 5039
						var32 = (var33 - 100) * 5 + 65280;
					}
				}

				if (Client.field628[var25] == 10) { // L: 5041
					var33 = 150 - Client.field733[var25]; // L: 5042
					if (var33 < 50) { // L: 5043
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) { // L: 5044
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 5045
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (Client.field628[var25] == 11) { // L: 5047
					var33 = 150 - Client.field733[var25]; // L: 5048
					if (var33 < 50) { // L: 5049
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) { // L: 5050
						var32 = (var33 - 50) * 327685 + 65280;
					} else if (var33 < 150) { // L: 5051
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}

				int var34;
				if (Client.field628[var25] == 12 && Client.field630[var25] == null) { // L: 5053 5054
					var33 = var31.length(); // L: 5055
					Client.field630[var25] = new int[var33]; // L: 5056

					for (var34 = 0; var34 < var33; ++var34) { // L: 5057
						int var35 = (int)(64.0F * ((float)var34 / (float)var33)); // L: 5058
						int var36 = var35 << 10 | 896 | 64; // L: 5059
						Client.field630[var25][var34] = class481.field4838[var36]; // L: 5060
					}
				}

				if (Client.field824[var25] == 0) { // L: 5064
					SoundCache.fontBold12.method7626(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.field630[var25]);
				}

				if (Client.field824[var25] == 1) { // L: 5065
					SoundCache.fontBold12.method7622(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, Client.field630[var25]);
				}

				if (Client.field824[var25] == 2) { // L: 5066
					SoundCache.fontBold12.method7627(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, Client.field630[var25]);
				}

				if (Client.field824[var25] == 3) { // L: 5067
					SoundCache.fontBold12.method7628(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.field733[var25], Client.field630[var25]);
				}

				if (Client.field824[var25] == 4) { // L: 5068
					var33 = (150 - Client.field733[var25]) * (SoundCache.fontBold12.stringWidth(var31) + 100) / 150; // L: 5069
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5070
					SoundCache.fontBold12.method7656(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0, Client.field630[var25]); // L: 5071
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5072
				}

				if (Client.field824[var25] == 5) { // L: 5074
					var33 = 150 - Client.field733[var25]; // L: 5075
					var34 = 0; // L: 5076
					if (var33 < 25) { // L: 5077
						var34 = var33 - 25;
					} else if (var33 > 125) { // L: 5078
						var34 = var33 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - SoundCache.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5079
					SoundCache.fontBold12.method7626(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0, Client.field630[var25]); // L: 5080
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5081
				}
			} else {
				SoundCache.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5085
			}
		}

		HealthBarDefinition.method3711(var0, var1); // L: 5089
		((TextureProvider)Rasterizer3D.field2550.Rasterizer3D_textureLoader).animate(Client.field709); // L: 5090
		class422.method7778(); // L: 5092
		Client.cameraX = var12; // L: 5094
		class17.cameraY = var13; // L: 5095
		WorldMapArea.cameraZ = var14; // L: 5096
		class365.cameraPitch = var15; // L: 5097
		DecorativeObject.cameraYaw = var16; // L: 5098
		if (Client.field531 && class59.field452.method7007(true, false) == 0) { // L: 5099
			Client.field531 = false;
		}

		if (Client.field531) { // L: 5100
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5101
			class427.drawLoadingMessage("Loading - please wait.", false); // L: 5102
		}

	} // L: 5104
}
