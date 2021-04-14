import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bi")
	public static String field2966;
	@ObfuscatedName("cv")
	public static String field3005;
	@ObfuscatedName("jo")
	public static String field2961;
	@ObfuscatedName("ju")
	public static String field2955;
	@ObfuscatedName("jx")
	public static String field3183;

	static {
		field2966 = "Please visit the support page for assistance.";
		field3005 = "Please visit the support page for assistance.";
		field2961 = "";
		field2955 = "Page has opened in a new window.";
		field3183 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1090221079"
	)
	static final void method4404() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field724[++Client.field723 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.field1220 = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.field1220 = Client.cycle;
						Client.field646[++Client.field645 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.field1220 = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2235(var7, (byte)1);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field646[++Client.field645 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.field1220 = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2235(var7, (byte)2);
							var8 = var0.readBits(3);
							var4.method2235(var8, (byte)2);
							int var9 = var0.readBits(1);
							if (var9 == 1) {
								Client.field646[++Client.field645 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field724[++Client.field723 - 1] = var3;
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "54"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class231.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class19.runScriptEvent(var5);
		}

		Client.field874 = var3;
		Client.isSpellSelected = true;
		class148.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		UserComparator10.selectedSpellFlags = var2;
		class29.invalidateWidget(var4);
	}
}
