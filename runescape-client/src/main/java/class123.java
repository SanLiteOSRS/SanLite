import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class123 extends class126 {
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1571829515
	)
	int field1505;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -340443607
	)
	int field1506;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1105823033
	)
	int field1504;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 590470605
	)
	int field1507;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class123(class129 var1) {
		this.this$0 = var1;
		this.field1505 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1505 = var1.readUnsignedShort();
		this.field1506 = var1.readInt();
		this.field1504 = var1.readUnsignedByte();
		this.field1507 = var1.readUnsignedByte();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2860(this.field1505, this.field1506, this.field1504, this.field1507);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "113"
	)
	public static int[] method2720() {
		int[] var0 = new int[KeyHandler.field139];

		for (int var1 = 0; var1 < KeyHandler.field139; ++var1) {
			var0[var1] = KeyHandler.field135[var1];
		}

		return var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "305738190"
	)
	static int method2719(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-296452038"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class13.loadInterface(var0)) {
			class111.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-59"
	)
	static void method2721(String var0) {
		ReflectionCheck.field256 = var0;

		try {
			String var1 = class414.client.getParameter(Integer.toString(18));
			String var2 = class414.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = DirectByteArrayCopier.method5318() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class27.method394(class414.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
