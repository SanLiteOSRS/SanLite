import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class10 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("s")
	HttpsURLConnection field57;
	@ObfuscatedName("h")
	final Map field56;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	class399 field49;
	@ObfuscatedName("v")
	Map field50;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class9 field51;
	@ObfuscatedName("q")
	boolean field55;
	@ObfuscatedName("i")
	boolean field53;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 638517017
	)
	int field54;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Ln;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field55 = false;
		this.field53 = false;
		this.field54 = 300000;
		if (!var2.method64()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method76());
		} else {
			this.field57 = (HttpsURLConnection)var1.openConnection();
			if (!var3) {
				this.field57.setSSLSocketFactory(class15.method185());
			}

			this.field51 = var2;
			this.field56 = new HashMap();
			this.field50 = new HashMap();
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "255"
	)
	public void method82(String var1, String var2) {
		if (!this.field55) {
			this.field56.put(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-647888404"
	)
	String method83() {
		ArrayList var1 = new ArrayList(this.field50.entrySet());
		Collections.sort(var1, new class18(this)); // L: 42
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class398)var4.getKey()).method7043()); // L: 60
			float var5 = (Float)var4.getValue(); // L: 61
			if (var5 < 1.0F) { // L: 62
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6); // L: 64
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "626536480"
	)
	void method84() throws ProtocolException {
		if (!this.field55) {
			this.field57.setRequestMethod(this.field51.method76());
			if (!this.field50.isEmpty()) { // L: 74
				this.field56.put("Accept", this.method83());
			}

			Iterator var1 = this.field56.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field57.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 78
			}

			if (this.field51.method66() && this.field49 != null) {
				this.field57.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field49.vmethod7057());
					var13.writeTo(this.field57.getOutputStream()); // L: 86
				} catch (IOException var11) {
					var11.printStackTrace(); // L: 89
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) { // L: 96
							var10.printStackTrace();
						}
					}

				}
			}

			this.field57.setConnectTimeout(this.field54);
			this.field57.setInstanceFollowRedirects(this.field53); // L: 103
			this.field55 = true; // L: 104
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "34538431"
	)
	boolean method85() throws IOException, SocketTimeoutException {
		if (!this.field55) {
			this.method84();
		}

		this.field57.connect();
		return this.field57.getResponseCode() == -1; // L: 110
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lx;",
		garbageValue = "-19"
	)
	class21 method81() {
		try {
			if (!this.field55 || this.field57.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 118
			this.field57.disconnect(); // L: 119
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null; // L: 122

		class21 var3;
		try {
			var1 = new class21(this.field57);
			return var1;
		} catch (IOException var8) { // L: 126
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field57.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ldj;FB)F",
		garbageValue = "-96"
	)
	static float method86(class117 var0, float var1) {
		if (var0 != null && var0.method2712() != 0) { // L: 18
			if (var1 < (float)var0.field1441[0].field1400) {
				return var0.field1439 == class116.field1434 ? var0.field1441[0].field1399 : class352.method6436(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1441[var0.method2712() - 1].field1400) {
				return var0.field1449 == class116.field1434 ? var0.field1441[var0.method2712() - 1].field1399 : class352.method6436(var0, var1, false); // L: 31
			} else if (var0.field1438) {
				return var0.field1441[0].field1399;
			} else {
				class113 var2 = var0.method2691(var1); // L: 36
				boolean var3 = false; // L: 37
				boolean var4 = false; // L: 38
				if (var2 == null) { // L: 39
					return 0.0F; // L: 149
				} else {
					float var7;
					if (0.0D == (double)var2.field1402 && (double)var2.field1398 == 0.0D) { // L: 40
						var3 = true; // L: 41
					} else if (Float.MAX_VALUE == var2.field1402 && Float.MAX_VALUE == var2.field1398) { // L: 43
						var4 = true; // L: 44
					} else if (var2.field1404 != null) { // L: 46
						if (var0.field1448) { // L: 47
							float[] var5 = new float[4]; // L: 48
							float[] var6 = new float[4]; // L: 49
							var5[0] = (float)var2.field1400; // L: 50
							var6[0] = var2.field1399; // L: 51
							var5[1] = var5[0] + 0.33333334F * var2.field1402; // L: 52
							var6[1] = var2.field1398 * 0.33333334F + var6[0]; // L: 53
							var5[3] = (float)var2.field1404.field1400; // L: 54
							var6[3] = var2.field1404.field1399; // L: 55
							var5[2] = var5[3] - 0.33333334F * var2.field1404.field1403; // L: 56
							var6[2] = var6[3] - var2.field1404.field1401 * 0.33333334F; // L: 57
							if (var0.field1447) { // L: 58
								RouteStrategy.method3813(var0, var5, var6); // L: 59
							} else if (var0 != null) { // L: 63
								var0.field1437 = var5[0]; // L: 66
								var7 = var5[3] - var5[0]; // L: 67
								float var8 = var6[3] - var6[0]; // L: 68
								float var9 = var5[1] - var5[0]; // L: 69
								float var10 = 0.0F; // L: 70
								float var11 = 0.0F; // L: 71
								if ((double)var9 != 0.0D) { // L: 72
									var10 = (var6[1] - var6[0]) / var9; // L: 73
								}

								var9 = var5[3] - var5[2]; // L: 75
								if (0.0D != (double)var9) { // L: 76
									var11 = (var6[3] - var6[2]) / var9; // L: 77
								}

								float var12 = 1.0F / (var7 * var7); // L: 79
								float var13 = var7 * var10; // L: 80
								float var14 = var7 * var11; // L: 81
								var0.field1445[0] = var12 * (var13 + var14 - var8 - var8) / var7; // L: 82
								var0.field1445[1] = (var8 + var8 + var8 - var13 - var13 - var14) * var12; // L: 83
								var0.field1445[2] = var10; // L: 84
								var0.field1445[3] = var6[0]; // L: 85
							}

							var0.field1448 = false; // L: 88
						}
					} else {
						var3 = true; // L: 92
					}

					if (var3) { // L: 94
						return var2.field1399; // L: 95
					} else if (var4) { // L: 97
						return (float)var2.field1400 != var1 && var2.field1404 != null ? var2.field1404.field1399 : var2.field1399; // L: 98 99 102
					} else if (var0.field1447) { // L: 105
						float var18;
						if (var0 == null) { // L: 108
							var18 = 0.0F; // L: 109
						} else {
							float var15;
							if (var0.field1437 == var1) { // L: 113
								var15 = 0.0F; // L: 114
							} else if (var1 == var0.field1444) { // L: 116
								var15 = 1.0F; // L: 117
							} else {
								var15 = (var1 - var0.field1437) / (var0.field1444 - var0.field1437); // L: 120
							}

							if (var0.field1442) { // L: 123
								var7 = var15; // L: 124
							} else {
								float[] var16 = new float[]{var0.field1445[0] - var15, var0.field1445[1], var0.field1445[2], var0.field1445[3]}; // L: 127 128 129 130 131
								float[] var17 = new float[5]; // L: 132
								int var19 = MilliClock.method3234(var16, 3, 0.0F, true, 1.0F, true, var17); // L: 133
								if (var19 == 1) { // L: 134
									var7 = var17[0]; // L: 135
								} else {
									var7 = 0.0F; // L: 138
								}
							}

							var18 = var7 * (var0.field1440[1] + (var7 * var0.field1440[3] + var0.field1440[2]) * var7) + var0.field1440[0]; // L: 141
						}

						return var18; // L: 143
					} else {
						return class398.method7040(var0, var1); // L: 146
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;B)V",
		garbageValue = "53"
	)
	public static void method89(AbstractArchive var0) {
		class438.field4678 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lbz;",
		garbageValue = "-1734516989"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class21.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static final void method101() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3782
			var0 = ScriptFrame.localPlayer.x; // L: 3783
			var1 = ScriptFrame.localPlayer.y; // L: 3784
			if (FloorOverlayDefinition.oculusOrbFocalPointX - var0 < -500 || FloorOverlayDefinition.oculusOrbFocalPointX - var0 > 500 || AbstractUserComparator.oculusOrbFocalPointY - var1 < -500 || AbstractUserComparator.oculusOrbFocalPointY - var1 > 500) { // L: 3785
				FloorOverlayDefinition.oculusOrbFocalPointX = var0; // L: 3786
				AbstractUserComparator.oculusOrbFocalPointY = var1; // L: 3787
			}

			if (var0 != FloorOverlayDefinition.oculusOrbFocalPointX) { // L: 3789
				FloorOverlayDefinition.oculusOrbFocalPointX += (var0 - FloorOverlayDefinition.oculusOrbFocalPointX) / 16;
			}

			if (var1 != AbstractUserComparator.oculusOrbFocalPointY) { // L: 3790
				AbstractUserComparator.oculusOrbFocalPointY += (var1 - AbstractUserComparator.oculusOrbFocalPointY) / 16;
			}

			var2 = FloorOverlayDefinition.oculusOrbFocalPointX >> 7; // L: 3791
			var3 = AbstractUserComparator.oculusOrbFocalPointY >> 7; // L: 3792
			var4 = ObjectComposition.getTileHeight(FloorOverlayDefinition.oculusOrbFocalPointX, AbstractUserComparator.oculusOrbFocalPointY, class268.Client_plane); // L: 3793
			var5 = 0; // L: 3794
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3795
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3796
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3797
						int var8 = class268.Client_plane; // L: 3798
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3799
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3800
						if (var9 > var5) { // L: 3801
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3805
			if (var6 > 98048) { // L: 3806
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3807
				var6 = 32768;
			}

			if (var6 > Client.field658) { // L: 3808
				Client.field658 += (var6 - Client.field658) / 24;
			} else if (var6 < Client.field658) { // L: 3809
				Client.field658 += (var6 - Client.field658) / 80;
			}

			EnumComposition.field1891 = ObjectComposition.getTileHeight(ScriptFrame.localPlayer.x, ScriptFrame.localPlayer.y, class268.Client_plane) - Client.camFollowHeight; // L: 3810
		} else if (Client.oculusOrbState == 1) { // L: 3812
			if (Client.field484 && ScriptFrame.localPlayer != null) { // L: 3814
				var0 = ScriptFrame.localPlayer.pathX[0]; // L: 3815
				var1 = ScriptFrame.localPlayer.pathY[0]; // L: 3816
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3817
					FloorOverlayDefinition.oculusOrbFocalPointX = ScriptFrame.localPlayer.x; // L: 3818
					var2 = ObjectComposition.getTileHeight(ScriptFrame.localPlayer.x, ScriptFrame.localPlayer.y, class268.Client_plane) - Client.camFollowHeight; // L: 3819
					if (var2 < EnumComposition.field1891) { // L: 3820
						EnumComposition.field1891 = var2;
					}

					AbstractUserComparator.oculusOrbFocalPointY = ScriptFrame.localPlayer.y; // L: 3821
					Client.field484 = false; // L: 3822
				}
			}

			short var10 = -1; // L: 3825
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3826
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3827
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3828
				if (var10 == 0) { // L: 3829
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3830
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3831
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3833
				if (var10 == 0) { // L: 3834
					var10 = 256;
				} else if (var10 == 1024) { // L: 3835
					var10 = 768;
				} else {
					var10 = 512; // L: 3836
				}
			}

			byte var11 = 0; // L: 3838
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3839
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3840
				var11 = 1;
			}

			var2 = 0; // L: 3841
			if (var10 >= 0 || var11 != 0) { // L: 3842
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 3843
				var2 *= 16; // L: 3844
				Client.field565 = var10; // L: 3845
				Client.field566 = var11; // L: 3846
			}

			if (Client.field564 < var2) { // L: 3848
				Client.field564 += var2 / 8; // L: 3849
				if (Client.field564 > var2) { // L: 3850
					Client.field564 = var2;
				}
			} else if (Client.field564 > var2) { // L: 3852
				Client.field564 = Client.field564 * 9 / 10;
			}

			if (Client.field564 > 0) { // L: 3853
				var3 = Client.field564 / 16; // L: 3854
				if (Client.field565 >= 0) { // L: 3855
					var0 = Client.field565 - ClientPreferences.cameraYaw & 2047; // L: 3856
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3857
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3858
					FloorOverlayDefinition.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 3859
					AbstractUserComparator.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3860
				}

				if (Client.field566 != 0) { // L: 3862
					EnumComposition.field1891 += var3 * Client.field566; // L: 3863
					if (EnumComposition.field1891 > 0) { // L: 3864
						EnumComposition.field1891 = 0;
					}
				}
			} else {
				Client.field565 = -1; // L: 3868
				Client.field566 = -1; // L: 3869
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3871
				Client.packetWriter.addNode(DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2929, Client.packetWriter.isaacCipher)); // L: 3873
				Client.oculusOrbState = 0; // L: 3874
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Bounds.mouseCam) { // L: 3878
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3879
			Client.camAngleDX = var0 * 2; // L: 3880
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y; // L: 3881
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3882
			Client.camAngleDY = var1 * 2; // L: 3883
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3884
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3887
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3888
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3889
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3890
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3891
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3892
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3893
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3894
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3896
		Client.camAngleX += Client.camAngleDX / 2; // L: 3897
		if (Client.camAngleX < 128) { // L: 3898
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3899
			Client.camAngleX = 383;
		}

	} // L: 3900

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-76"
	)
	static final void method100(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11617
		if (var0 != FriendsChatMember.clientPreferences.method2222()) { // L: 11618
			if (FriendsChatMember.clientPreferences.method2222() == 0 && Client.currentTrackGroupId != -1) { // L: 11619
				class118.method2713(PacketBuffer.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11620
				Client.playingJingle = false; // L: 11621
			} else if (var0 == 0) { // L: 11623
				ItemContainer.midiPcmStream.clear(); // L: 11625
				class273.musicPlayerStatus = 1; // L: 11626
				NetFileRequest.musicTrackArchive = null; // L: 11627
				Client.playingJingle = false; // L: 11629
			} else if (class273.musicPlayerStatus != 0) { // L: 11632
				class28.musicTrackVolume = var0;
			} else {
				ItemContainer.midiPcmStream.setPcmStreamVolume(var0); // L: 11633
			}

			FriendsChatMember.clientPreferences.method2224(var0); // L: 11635
		}

	} // L: 11637
}
