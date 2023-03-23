import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ax")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field61 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1451823981"
	)
	public static int method100(int var0) {
		return class279.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 77
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "447191923"
	)
	static final int method102(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 979
		var2 ^= var2 << 13; // L: 980
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 981
		return var3 >> 19 & 255; // L: 982
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2041492110"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2754
		if (var0 == -3) { // L: 2757
			Tile.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2758
			Tile.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2759
			Tile.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2760
			class14.method173(3); // L: 2761
			Login.field887 = 1; // L: 2762
		} else if (var0 == 4) { // L: 2764
			class14.method173(14); // L: 2766
			Login.field901 = 0; // L: 2767
		} else if (var0 == 5) { // L: 2770
			Login.field887 = 2; // L: 2771
			Tile.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2772
		} else if (var0 == 68 || !Client.onMobile && var0 == 6) { // L: 2774
			Tile.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2775
		} else if (var0 == 7) { // L: 2777
			Tile.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2778
			Tile.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2779
			Tile.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2780
			Tile.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2781
			Tile.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2782
			Tile.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2783
			Tile.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2784
			Tile.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2785
			Tile.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
		} else if (var0 == 17) { // L: 2786
			Tile.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 2787
			class14.method173(14); // L: 2789
			Login.field901 = 1; // L: 2790
		} else if (var0 == 19) { // L: 2793
			Tile.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 2794
			Tile.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 2795
			Tile.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 2796
			Tile.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 2797
			Tile.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 2798
			Tile.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 2799
			Tile.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 2800
			Tile.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) { // L: 2801
			Tile.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) { // L: 2802
			class14.method173(14); // L: 2804
			Login.field901 = 2; // L: 2805
		} else if (var0 == 37) { // L: 2808
			Tile.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 2809
			Tile.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) { // L: 2810
			class14.method173(8); // L: 2811
		} else {
			if (var0 == 56) { // L: 2813
				Tile.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2814
				class19.method280(11); // L: 2815
				return; // L: 2816
			}

			if (var0 == 57) { // L: 2818
				Tile.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2819
				class19.method280(11); // L: 2820
				return; // L: 2821
			}

			if (var0 == 61) { // L: 2823
				Tile.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2824
				class14.method173(7); // L: 2825
			} else {
				if (var0 == 62) { // L: 2827
					class19.method280(10); // L: 2828
					class14.method173(9); // L: 2829
					Tile.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2830
					return; // L: 2831
				}

				if (var0 == 63) { // L: 2833
					class19.method280(10); // L: 2834
					class14.method173(9); // L: 2835
					Tile.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2836
					return; // L: 2837
				}

				if (var0 == 65 || var0 == 67) { // L: 2839
					class19.method280(10); // L: 2840
					class14.method173(9); // L: 2841
					Tile.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2842
					return; // L: 2843
				}

				if (var0 == 71) { // L: 2845
					class19.method280(10); // L: 2846
					class14.method173(7); // L: 2847
					Tile.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2848
				} else if (var0 == 73) { // L: 2850
					class19.method280(10); // L: 2851
					class14.method173(6); // L: 2852
					Tile.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2853
				} else if (var0 == 72) { // L: 2855
					class19.method280(10); // L: 2856
					class14.method173(26); // L: 2857
				} else {
					Tile.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2859
				}
			}
		}

		class19.method280(10); // L: 2860
		boolean var3 = var1 != Decimator.method1114(); // L: 2861
		if (!var3 && Client.field519.method8928()) { // L: 2862
			class14.method173(9); // L: 2863
		}

	} // L: 2865

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1903844308"
	)
	static final void method98() {
		PendingSpawn.method2351(class364.field4333, Coord.field3432, class307.field3449); // L: 3813
		class278.method5449(WorldMapRectangle.field2963, KeyHandler.field154); // L: 3814
		if (class381.cameraX == class364.field4333 && class351.cameraY == Coord.field3432 && class471.cameraZ == class307.field3449 && class311.cameraPitch == WorldMapRectangle.field2963 && class110.cameraYaw == KeyHandler.field154) { // L: 3815
			Client.field737 = false; // L: 3816
			Client.isCameraLocked = false; // L: 3817
			class167.field1800 = 0; // L: 3818
			Canvas.field123 = 0; // L: 3819
			MidiPcmStream.field3361 = 0; // L: 3820
			GrandExchangeOfferUnitPriceComparator.field4269 = 0; // L: 3821
			Skeleton.field2505 = 0; // L: 3822
			class313.field3676 = 0; // L: 3823
			class19.field104 = 0; // L: 3824
			class4.field7 = 0; // L: 3825
			WorldMapSectionType.field2937 = 0; // L: 3826
			class269.field3033 = 0; // L: 3827
		}

	} // L: 3830

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	static final void method99() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4858 4859 4876
			if (var0.plane == TaskHandler.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4860
				if (Client.cycle >= var0.cycleStart) { // L: 4861
					if (var0.targetIndex > 0) { // L: 4862
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4863
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4864
							var0.setDestination(var1.x, var1.y, WorldMapDecorationType.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4866
						int var2 = -var0.targetIndex - 1; // L: 4868
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4869
							var3 = BuddyRankComparator.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4870
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, WorldMapDecorationType.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4871
						}
					}

					var0.advance(Client.field631); // L: 4873
					class1.scene.drawEntity(TaskHandler.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4874
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4878

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)Z",
		garbageValue = "906710391"
	)
	static final boolean method103(Widget var0) {
		int var1 = var0.contentType; // L: 11816
		if (var1 == 205) { // L: 11817
			Client.logoutTimer = 250; // L: 11818
			return true; // L: 11819
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11821
				var2 = (var1 - 300) / 2; // L: 11822
				var3 = var1 & 1; // L: 11823
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11824
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11826
				var2 = (var1 - 314) / 2; // L: 11827
				var3 = var1 & 1; // L: 11828
				Client.playerAppearance.method5786(var2, var3 == 1); // L: 11829
			}

			if (var1 == 324) {
				Client.playerAppearance.method5787(0); // L: 11831
			}

			if (var1 == 325) { // L: 11832
				Client.playerAppearance.method5787(1);
			}

			if (var1 == 326) { // L: 11833
				PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher); // L: 11835
				Client.playerAppearance.write(var4.packetBuffer); // L: 11836
				Client.packetWriter.addNode(var4); // L: 11837
				return true; // L: 11838
			} else {
				return false; // L: 11840
			}
		}
	}
}
