import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lb;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field68; // L: 189
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public int getPeerPort() {
		return 0; // L: 199
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbq;",
		garbageValue = "27"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6666"
	)
	static void method270() {
		Login.worldSelectOpen = false; // L: 1869
		Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1870
		class275.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1871
		class33.logoSprite.drawAt(Login.xPadding + 382 - class33.logoSprite.subWidth / 2, 18); // L: 1872
	} // L: 1873

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1123154021"
	)
	static int method225(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 4904
			int var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4905
			ObjectComposition var4 = class463.getObjectDefinition(var3); // L: 4906
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4907
			return 1; // L: 4908
		} else {
			return 2; // L: 4910
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-106"
	)
	static int method274(int var0) {
		return var0 * 3 + 600; // L: 1741
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2130757009"
	)
	static long method246() {
		return Client.field631; // L: 3228
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lru;I)V",
		garbageValue = "-1378183509"
	)
	static final void method221(PacketBuffer var0) {
		var0.importIndex(); // L: 8773
		int var1 = var0.readBits(8); // L: 8774
		int var2;
		if (var1 < Client.npcCount) { // L: 8775
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8776
				Client.field635[++Client.field634 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8778
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8779

			for (var2 = 0; var2 < var1; ++var2) { // L: 8780
				int var3 = Client.npcIndices[var2]; // L: 8781
				NPC var4 = Client.npcs[var3]; // L: 8782
				int var5 = var0.readBits(1); // L: 8783
				if (var5 == 0) { // L: 8784
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8785
					var4.npcCycle = Client.cycle; // L: 8786
				} else {
					int var6 = var0.readBits(2); // L: 8789
					if (var6 == 0) { // L: 8790
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8791
						var4.npcCycle = Client.cycle; // L: 8792
						Client.field558[++Client.field557 - 1] = var3; // L: 8793
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8796
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8797
							var4.npcCycle = Client.cycle; // L: 8798
							var7 = var0.readBits(3); // L: 8799
							var4.method2624(var7, class208.field2360); // L: 8800
							var8 = var0.readBits(1); // L: 8801
							if (var8 == 1) { // L: 8802
								Client.field558[++Client.field557 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8805
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8806
							var4.npcCycle = Client.cycle; // L: 8807
							if (var0.readBits(1) == 1) { // L: 8808
								var7 = var0.readBits(3); // L: 8809
								var4.method2624(var7, class208.field2362); // L: 8810
								var8 = var0.readBits(3); // L: 8811
								var4.method2624(var8, class208.field2362); // L: 8812
							} else {
								var7 = var0.readBits(3); // L: 8815
								var4.method2624(var7, class208.field2366); // L: 8816
							}

							var7 = var0.readBits(1); // L: 8818
							if (var7 == 1) { // L: 8819
								Client.field558[++Client.field557 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8822
							Client.field635[++Client.field634 - 1] = var3; // L: 8823
						}
					}
				}
			}

		}
	} // L: 8827

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1234597482"
	)
	static final void method229(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11346
		int var7 = var3 - var1; // L: 11347
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11348
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11349
		int var10 = var8; // L: 11350
		if (var8 < var9) { // L: 11351
			var10 = var9;
		}

		if (var10 != 0) { // L: 11352
			int var11 = (var6 << 16) / var10; // L: 11353
			int var12 = (var7 << 16) / var10; // L: 11354
			if (var12 <= var11) { // L: 11355
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11356
			}

			int var13 = var5 * var12 >> 17; // L: 11357
			int var14 = var5 * var12 + 1 >> 17; // L: 11358
			int var15 = var5 * var11 >> 17; // L: 11359
			int var16 = var5 * var11 + 1 >> 17; // L: 11360
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11361
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11362
			int var17 = var0 + var13; // L: 11363
			int var18 = var0 - var14; // L: 11364
			int var19 = var0 + var6 - var14; // L: 11365
			int var20 = var0 + var6 + var13; // L: 11366
			int var21 = var15 + var1; // L: 11367
			int var22 = var1 - var16; // L: 11368
			int var23 = var7 + var1 - var16; // L: 11369
			int var24 = var7 + var15 + var1; // L: 11370
			Rasterizer3D.method4334(var17, var18, var19); // L: 11371
			Rasterizer3D.method4339(var21, var22, var23, var17, var18, var19, var4); // L: 11372
			Rasterizer3D.method4334(var17, var19, var20); // L: 11373
			Rasterizer3D.method4339(var21, var23, var24, var17, var19, var20, var4); // L: 11374
		}
	} // L: 11375
}
