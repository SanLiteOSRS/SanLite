import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class128 extends class132 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("i")
	String field1469;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2112736833
	)
	int field1467;
	@ObfuscatedName("s")
	byte field1468;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class128(class133 var1) {
		this.this$0 = var1;
		this.field1469 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1469 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1467 = var1.readUnsignedShort();
		this.field1468 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1469);
		var2.world = this.field1467;
		var2.rank = this.field1468;
		var1.addMember(var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[Lia;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2796, ServerPacket.field2874, ServerPacket.field2863, ServerPacket.field2865, ServerPacket.field2821, ServerPacket.field2797, ServerPacket.field2798, ServerPacket.field2799, ServerPacket.field2853, ServerPacket.field2801, ServerPacket.field2802, ServerPacket.field2803, ServerPacket.field2804, ServerPacket.field2805, ServerPacket.field2870, ServerPacket.field2807, ServerPacket.field2808, ServerPacket.field2809, ServerPacket.field2810, ServerPacket.field2855, ServerPacket.field2812, ServerPacket.field2813, ServerPacket.field2814, ServerPacket.field2815, ServerPacket.field2878, ServerPacket.field2817, ServerPacket.field2818, ServerPacket.field2852, ServerPacket.field2820, ServerPacket.field2831, ServerPacket.field2822, ServerPacket.field2823, ServerPacket.field2824, ServerPacket.field2825, ServerPacket.field2826, ServerPacket.field2827, ServerPacket.field2828, ServerPacket.field2829, ServerPacket.field2830, ServerPacket.field2887, ServerPacket.field2880, ServerPacket.field2833, ServerPacket.field2834, ServerPacket.field2835, ServerPacket.field2836, ServerPacket.field2837, ServerPacket.field2838, ServerPacket.field2839, ServerPacket.field2840, ServerPacket.field2841, ServerPacket.field2842, ServerPacket.field2843, ServerPacket.field2844, ServerPacket.field2845, ServerPacket.field2846, ServerPacket.field2800, ServerPacket.field2885, ServerPacket.field2849, ServerPacket.field2850, ServerPacket.field2811, ServerPacket.field2793, ServerPacket.field2847, ServerPacket.field2795, ServerPacket.field2859, ServerPacket.field2856, ServerPacket.field2857, ServerPacket.field2858, ServerPacket.field2806, ServerPacket.field2860, ServerPacket.field2861, ServerPacket.field2872, ServerPacket.field2877, ServerPacket.field2864, ServerPacket.field2851, ServerPacket.field2832, ServerPacket.field2867, ServerPacket.field2868, ServerPacket.field2869, ServerPacket.field2819, ServerPacket.field2871, ServerPacket.field2792, ServerPacket.field2873, ServerPacket.field2890, ServerPacket.field2862, ServerPacket.field2876, ServerPacket.field2875, ServerPacket.field2816, ServerPacket.field2879, ServerPacket.field2882, ServerPacket.field2881, ServerPacket.field2794, ServerPacket.field2883, ServerPacket.field2884, ServerPacket.field2886, ServerPacket.field2854, ServerPacket.field2892, ServerPacket.field2888};
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;Lko;Lko;B)V",
		garbageValue = "-43"
	)
	public static void method2720(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		class283.Widget_archive = var0;
		Widget.Widget_modelsArchive = var1;
		WorldMapScaleHandler.Widget_spritesArchive = var2;
		class134.Widget_fontsArchive = var3;
		WorldMapSection1.Widget_interfaceComponents = new Widget[class283.Widget_archive.getGroupCount()][];
		class132.Widget_loadedInterfaces = new boolean[class283.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-63"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class408.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)Z",
		garbageValue = "-636935524"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class113.method2532(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1742538155"
	)
	static void method2728(String var0) {
		UserComparator3.field1316 = var0;

		try {
			String var1 = ArchiveLoader.client.getParameter(Integer.toString(18));
			String var2 = ArchiveLoader.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + HorizontalAlignment.method3113(class111.method2516() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class27.method393(ArchiveLoader.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
