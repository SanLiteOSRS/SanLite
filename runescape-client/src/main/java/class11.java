import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ag")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
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

			this.this$2.this$1.field57 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Ljava/util/ArrayList;I)Z",
		garbageValue = "840469582"
	)
	public static boolean method109(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class321.field3493 = var0; // L: 29
		class321.field3494 = var1; // L: 30
		class321.field3497 = var2; // L: 31
		class321.field3491 = var3;
		return true; // L: 33
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class529.World_request == null) { // L: 32
				class529.World_request = class94.urlRequester.request(new URL(class128.field1538));
			} else if (class529.World_request.isDone()) { // L: 34
				byte[] var0 = class529.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				World.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = World.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				FloorUnderlayDefinition.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				class529.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			class529.World_request = null; // L: 58
		}

		return false; // L: 60
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "44"
	)
	public static void method108(int var0, int var1) {
		WorldMapSection2.method5289(var0, var1, 0, 0); // L: 77
		class321.field3496.clear(); // L: 78
		class321.field3498.clear(); // L: 79
		if (class321.field3495.isEmpty() || var0 == 0 && var1 == 0) { // L: 80
			WorldMapEvent.method5834(); // L: 98
		} else {
			class321.field3498.add(new class422((class426)null, class321.field3492)); // L: 81
			class321.field3498.add(new class424((class426)null, 0, false, class321.field3501)); // L: 82
			ArrayList var3 = new ArrayList(); // L: 85
			Iterator var4 = class321.field3495.iterator(); // L: 86

			while (var4.hasNext()) {
				class333 var5 = (class333)var4.next(); // L: 87
				var3.add(var5); // L: 89
			}

			class321.field3498.add(new class421((class426)null, var3)); // L: 95
		}

	} // L: 100

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	protected static final void method103() {
		GameEngine.clock.mark(); // L: 454

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 455
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 456
			GameEngine.clientTickTimes[var0] = 0L;
		}

		VertexNormal.gameCyclesToDo = 0; // L: 457
	} // L: 458

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "85657971"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class170.method3431(); // L: 12425

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12427
			if (var1.obj != null) { // L: 12428
				var1.set();
			}
		}

		int var4 = UserComparator8.VarpDefinition_get(var0).type; // L: 12431
		if (var4 != 0) { // L: 12432
			int var2 = Varps.Varps_main[var0]; // L: 12433
			if (var4 == 1) { // L: 12434
				if (var2 == 1) { // L: 12435
					ReflectionCheck.method669(0.9D);
				}

				if (var2 == 2) { // L: 12436
					ReflectionCheck.method669(0.8D);
				}

				if (var2 == 3) { // L: 12437
					ReflectionCheck.method669(0.7D);
				}

				if (var2 == 4) { // L: 12438
					ReflectionCheck.method669(0.6D);
				}
			}

			if (var4 == 3) { // L: 12440
				if (var2 == 0) { // L: 12441
					InvDefinition.method3706(255);
				}

				if (var2 == 1) { // L: 12442
					InvDefinition.method3706(192);
				}

				if (var2 == 2) { // L: 12443
					InvDefinition.method3706(128);
				}

				if (var2 == 3) { // L: 12444
					InvDefinition.method3706(64);
				}

				if (var2 == 4) { // L: 12445
					InvDefinition.method3706(0);
				}
			}

			if (var4 == 4) { // L: 12447
				if (var2 == 0) { // L: 12448
					class522.method9128(127);
				}

				if (var2 == 1) { // L: 12449
					class522.method9128(96);
				}

				if (var2 == 2) { // L: 12450
					class522.method9128(64);
				}

				if (var2 == 3) { // L: 12451
					class522.method9128(32);
				}

				if (var2 == 4) { // L: 12452
					class522.method9128(0);
				}
			}

			if (var4 == 5) {
				Client.field809 = var2 == 1; // L: 12454
			}

			if (var4 == 6) { // L: 12455
				Client.chatEffects = var2;
			}

			if (var4 == 9) { // L: 12456
			}

			if (var4 == 10) { // L: 12457
				if (var2 == 0) { // L: 12458
					ObjectSound.method1921(127);
				}

				if (var2 == 1) { // L: 12459
					ObjectSound.method1921(96);
				}

				if (var2 == 2) { // L: 12460
					ObjectSound.method1921(64);
				}

				if (var2 == 3) { // L: 12461
					ObjectSound.method1921(32);
				}

				if (var2 == 4) { // L: 12462
					ObjectSound.method1921(0);
				}
			}

			if (var4 == 17) { // L: 12464
				Client.followerIndex = var2 & 65535; // L: 12465
			}

			AttackOption[] var3;
			if (var4 == 18) { // L: 12467
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1358, AttackOption.field1360, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick}; // L: 12470
				Client.playerAttackOption = (AttackOption)KitDefinition.findEnumerated(var3, var2); // L: 12472
				if (Client.playerAttackOption == null) { // L: 12473
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) { // L: 12475
				if (var2 == -1) { // L: 12476
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12477
				}
			}

			if (var4 == 22) { // L: 12479
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1358, AttackOption.field1360, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick}; // L: 12482
				Client.npcAttackOption = (AttackOption)KitDefinition.findEnumerated(var3, var2); // L: 12484
				if (Client.npcAttackOption == null) { // L: 12485
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12487
}
