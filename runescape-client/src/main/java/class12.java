import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("m")
class class12 extends SSLSocket {
	@ObfuscatedName("fp")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("s")
	Certificate[] field70;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lz;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	} // L: 342

	public void setEnabledCipherSuites(String[] var1) {
	}

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIILgy;[Lgl;B)V",
		garbageValue = "-68"
	)
	static final void method157(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 275
		int var6 = -1; // L: 276

		while (true) {
			int var7 = var5.method7881(); // L: 278
			if (var7 == 0) { // L: 279
				return; // L: 303
			}

			var6 += var7; // L: 280
			int var8 = 0; // L: 281

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 283
				if (var9 == 0) { // L: 284
					break;
				}

				var8 += var9 - 1; // L: 285
				int var10 = var8 & 63; // L: 286
				int var11 = var8 >> 6 & 63; // L: 287
				int var12 = var8 >> 12; // L: 288
				int var13 = var5.readUnsignedByte(); // L: 289
				int var14 = var13 >> 2; // L: 290
				int var15 = var13 & 3; // L: 291
				int var16 = var11 + var1; // L: 292
				int var17 = var10 + var2; // L: 293
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 294
					int var18 = var12; // L: 295
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 296
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 297
					if (var18 >= 0) { // L: 298
						var19 = var4[var18];
					}

					class347.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 299
				}
			}
		}
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1182686074"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2699
		if (var0 == -3) { // L: 2702
			ItemComposition.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2703
			ItemComposition.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2704
			ItemComposition.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2705
			class116.method2683(3); // L: 2706
			Login.field875 = 1; // L: 2707
		} else if (var0 == 4) { // L: 2709
			class116.method2683(14); // L: 2711
			Login.field882 = 0; // L: 2712
		} else if (var0 == 5) { // L: 2715
			Login.field875 = 2; // L: 2716
			ItemComposition.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes."); // L: 2717
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2719
			if (var0 == 7) { // L: 2722
				ItemComposition.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2723
				ItemComposition.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2724
				ItemComposition.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2725
				ItemComposition.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2726
				ItemComposition.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2727
				ItemComposition.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2728
				ItemComposition.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2729
				ItemComposition.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2730
				ItemComposition.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2731
				ItemComposition.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2732
				class116.method2683(14); // L: 2734
				Login.field882 = 1; // L: 2735
			} else if (var0 == 19) { // L: 2738
				ItemComposition.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2739
				ItemComposition.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2740
				ItemComposition.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2741
				ItemComposition.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2742
				ItemComposition.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2743
				ItemComposition.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2744
				ItemComposition.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2745
				ItemComposition.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2746
				ItemComposition.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2747
				class116.method2683(14); // L: 2749
				Login.field882 = 2; // L: 2750
			} else if (var0 == 37) { // L: 2753
				ItemComposition.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2754
				ItemComposition.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2755
				class116.method2683(8); // L: 2756
			} else {
				if (var0 == 56) { // L: 2758
					ItemComposition.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2759
					class4.updateGameState(11); // L: 2760
					return; // L: 2761
				}

				if (var0 == 57) { // L: 2763
					ItemComposition.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2764
					class4.updateGameState(11); // L: 2765
					return; // L: 2766
				}

				if (var0 == 61) { // L: 2768
					ItemComposition.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2769
					class116.method2683(7); // L: 2770
				} else {
					if (var0 == 62) { // L: 2772
						class4.updateGameState(10); // L: 2773
						class116.method2683(9); // L: 2774
						ItemComposition.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2775
						return; // L: 2776
					}

					if (var0 == 63) { // L: 2778
						class4.updateGameState(10); // L: 2779
						class116.method2683(9); // L: 2780
						ItemComposition.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2781
						return; // L: 2782
					}

					if (var0 == 65 || var0 == 67) { // L: 2784
						class4.updateGameState(10); // L: 2785
						class116.method2683(9); // L: 2786
						ItemComposition.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2787
						return; // L: 2788
					}

					if (var0 == 71) { // L: 2790
						class4.updateGameState(10); // L: 2791
						class116.method2683(7); // L: 2792
						ItemComposition.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2793
					} else if (var0 == 73) { // L: 2795
						class4.updateGameState(10); // L: 2796
						class116.method2683(6); // L: 2797
						ItemComposition.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2798
					} else if (var0 == 72) { // L: 2800
						class4.updateGameState(10); // L: 2801
						class116.method2683(26); // L: 2802
					} else {
						ItemComposition.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2804
					}
				}
			}
		} else {
			ItemComposition.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2720
		}

		class4.updateGameState(10); // L: 2805
		int var4 = Login.loginIndex; // L: 2809
		boolean var5 = var4 != var1; // L: 2811
		if (!var5 && Client.field512.method7914()) { // L: 2812
			class116.method2683(9); // L: 2813
		}

	} // L: 2815
}
