import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class435 {
	@ObfuscatedName("aj")
	final Map field4667;
	@ObfuscatedName("aq")
	final Map field4670;
	@ObfuscatedName("ar")
	final DecimalFormat field4671;

	public class435() {
		this.field4667 = new HashMap(); // L: 12
		this.field4670 = new HashMap(); // L: 13
		this.field4671 = new DecimalFormat(); // L: 14
		this.field4671.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;S)V",
		garbageValue = "128"
	)
	public void method8071(HttpsURLConnection var1) {
		Iterator var2 = this.field4667.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	} // L: 27

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "3"
	)
	public Map method8072() {
		return this.field4667; // L: 30
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-181363347"
	)
	public void method8073(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4667.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	} // L: 37

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1762378749"
	)
	public void method8075(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			this.field4667.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqo;Ljava/lang/String;I)V",
		garbageValue = "-1169940693"
	)
	void method8108(class434 var1, String var2) {
		String var3 = String.format("%s %s", var1.method8067(), var2); // L: 46
		this.method8073("Authorization", var3); // L: 47
	} // L: 48

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1535686521"
	)
	public void method8076(String var1) {
		this.method8108(class434.field4666, var1); // L: 51
	} // L: 52

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public void method8079(String var1) {
		this.method8108(class434.field4665, var1); // L: 55
	} // L: 56

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-393280493"
	)
	public void method8078(class476 var1) {
		this.field4667.put("Content-Type", var1.method8682()); // L: 59
	} // L: 60

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	public void method8094() {
		this.field4667.remove("Content-Type"); // L: 63
	} // L: 64

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-916509696"
	)
	public void method8080(class476 var1) {
		this.method8081(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsy;FI)V",
		garbageValue = "-1036165425"
	)
	void method8081(class476 var1, float var2) {
		this.field4670.put(var1, Math.max(0.0F, Math.min(1.0F, var2))); // L: 71
		this.method8082(); // L: 72
	} // L: 73

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-829187338"
	)
	void method8082() {
		this.field4667.remove("Accept"); // L: 76
		if (!this.field4670.isEmpty()) { // L: 77
			this.field4667.put("Accept", this.method8110()); // L: 78
		}

	} // L: 80

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-41"
	)
	String method8110() {
		ArrayList var1 = new ArrayList(this.field4670.entrySet()); // L: 83
		Collections.sort(var1, new class436(this)); // L: 84
		StringBuilder var2 = new StringBuilder(); // L: 97
		Iterator var3 = var1.iterator(); // L: 98

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) { // L: 101
				var2.append(",");
			}

			var2.append(((class476)var4.getKey()).method8682()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) { // L: 104
				String var6 = this.field4671.format((double)var5); // L: 105
				var2.append(";q=").append(var6); // L: 106
			}
		}

		return var2.toString(); // L: 110
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Luu;",
		garbageValue = "-463590672"
	)
	public static class521 method8115(int var0) {
		class521 var1 = (class521)class521.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class521.field5118.takeFile(39, var0); // L: 21
			var1 = new class521(); // L: 22
			if (var2 != null) { // L: 23
				var1.method9268(new Buffer(var2));
			}

			var1.method9266(); // L: 24
			class521.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIB)V",
		garbageValue = "51"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class25.localPlayer != var0) { // L: 10423
			if (Client.menuOptionsCount < 400) { // L: 10424
				String var4;
				if (var0.skillLevel == 0) { // L: 10426
					var4 = var0.actions[0] + var0.username + var0.actions[1] + MusicPatchNode2.method6038(var0.combatLevel, class25.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10427
				}

				int var5;
				if (Client.isItemSelected == 1) { // L: 10428
					class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10429
				} else if (Client.isSpellSelected) { // L: 10432
					if ((class60.field431 & 8) == 8) { // L: 10433
						class385.insertMenuItemNoShift(Client.field668, Client.field669 + " " + "->" + " " + class208.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10434
					}
				} else {
					for (var5 = 7; var5 >= 0; --var5) { // L: 10439
						if (Client.playerMenuActions[var5] != null) { // L: 10440
							short var6 = 0; // L: 10441
							if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) { // L: 10442
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 10443
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class25.localPlayer.combatLevel) { // L: 10444
									var6 = 2000; // L: 10445
								}

								if (class25.localPlayer.team != 0 && var0.team != 0) { // L: 10447
									if (var0.team == class25.localPlayer.team) { // L: 10448
										var6 = 2000;
									} else {
										var6 = 0; // L: 10449
									}
								} else if (Client.playerAttackOption == AttackOption.field1331 && var0.isClanMember()) { // L: 10451
									var6 = 2000; // L: 10452
								}
							} else if (Client.playerOptionsPriorities[var5]) { // L: 10455
								var6 = 2000;
							}

							boolean var7 = false; // L: 10456
							int var8 = Client.playerMenuOpcodes[var5] + var6; // L: 10457
							class385.insertMenuItemNoShift(Client.playerMenuActions[var5], class208.colorStartTag(16777215) + var4, var8, var1, var2, var3); // L: 10458
						}
					}
				}

				for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 10463
					if (Client.menuOpcodes[var5] == 23) { // L: 10464
						Client.menuTargets[var5] = class208.colorStartTag(16777215) + var4; // L: 10465
						break;
					}
				}

			}
		}
	} // L: 10469
}
