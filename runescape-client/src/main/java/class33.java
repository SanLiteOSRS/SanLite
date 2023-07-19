import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class33 {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -859125441
	)
	static int field176;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1298089937
	)
	int field168;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1789070201
	)
	int field174;

	class33(int var1, int var2) {
		this.field168 = var1; // L: 14
		this.field174 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)Z",
		garbageValue = "2124841046"
	)
	boolean method499(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field168) {
			case 1:
				return var1.vmethod4291(this.field174);
			case 2:
				return var1.vmethod4254(this.field174); // L: 26
			case 3:
				return var1.vmethod4255((char)this.field174);
			case 4:
				return var1.vmethod4276(this.field174 == 1); // L: 30
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "454253011"
	)
	public static PrivateChatMode method500(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5204, PrivateChatMode.field5207, PrivateChatMode.field5205}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field5203) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "71"
	)
	public static int method503(int var0, int var1, int var2) {
		int var3 = class217.method4380(var2 - var1 + 1); // L: 56
		var3 <<= var1; // L: 57
		var0 |= var3; // L: 58
		return var0; // L: 59
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "158804747"
	)
	static Date method502() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1112
		var0.setLenient(false); // L: 1113
		StringBuilder var1 = new StringBuilder(); // L: 1114
		String[] var2 = Login.field936; // L: 1116

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1117
			String var4 = var2[var3]; // L: 1118
			if (var4 == null) { // L: 1120
				AbstractWorldMapIcon.method5583("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1121
				return null; // L: 1122
			}

			var1.append(var4); // L: 1124
		}

		var1.append("12"); // L: 1128
		return var0.parse(var1.toString()); // L: 1129
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1403794806"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ServerPacket.getWidgetChild(var1, var2); // L: 10038
		if (var5 != null) { // L: 10039
			if (var5.onOp != null) { // L: 10040
				ScriptEvent var6 = new ScriptEvent(); // L: 10041
				var6.widget = var5; // L: 10042
				var6.opIndex = var0; // L: 10043
				var6.targetName = var4; // L: 10044
				var6.args = var5.onOp; // L: 10045
				class170.runScriptEvent(var6); // L: 10046
			}

			boolean var11 = true; // L: 10048
			if (var5.contentType > 0) { // L: 10049
				var11 = class10.method115(var5);
			}

			if (var11) { // L: 10050
				int var8 = class19.getWidgetFlags(var5); // L: 10052
				int var9 = var0 - 1; // L: 10053
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10055
				if (var7) { // L: 10057
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10060
						var10 = class217.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 10062
						var10.packetBuffer.writeInt(var1); // L: 10063
						var10.packetBuffer.writeShort(var2); // L: 10064
						var10.packetBuffer.writeShort(var3); // L: 10065
						Client.packetWriter.addNode(var10); // L: 10066
					}

					if (var0 == 2) { // L: 10068
						var10 = class217.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 10070
						var10.packetBuffer.writeInt(var1); // L: 10071
						var10.packetBuffer.writeShort(var2); // L: 10072
						var10.packetBuffer.writeShort(var3); // L: 10073
						Client.packetWriter.addNode(var10); // L: 10074
					}

					if (var0 == 3) { // L: 10076
						var10 = class217.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher); // L: 10078
						var10.packetBuffer.writeInt(var1); // L: 10079
						var10.packetBuffer.writeShort(var2); // L: 10080
						var10.packetBuffer.writeShort(var3); // L: 10081
						Client.packetWriter.addNode(var10); // L: 10082
					}

					if (var0 == 4) { // L: 10084
						var10 = class217.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 10086
						var10.packetBuffer.writeInt(var1); // L: 10087
						var10.packetBuffer.writeShort(var2); // L: 10088
						var10.packetBuffer.writeShort(var3); // L: 10089
						Client.packetWriter.addNode(var10); // L: 10090
					}

					if (var0 == 5) { // L: 10092
						var10 = class217.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 10094
						var10.packetBuffer.writeInt(var1); // L: 10095
						var10.packetBuffer.writeShort(var2); // L: 10096
						var10.packetBuffer.writeShort(var3); // L: 10097
						Client.packetWriter.addNode(var10); // L: 10098
					}

					if (var0 == 6) { // L: 10100
						var10 = class217.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 10102
						var10.packetBuffer.writeInt(var1); // L: 10103
						var10.packetBuffer.writeShort(var2); // L: 10104
						var10.packetBuffer.writeShort(var3); // L: 10105
						Client.packetWriter.addNode(var10); // L: 10106
					}

					if (var0 == 7) { // L: 10108
						var10 = class217.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 10110
						var10.packetBuffer.writeInt(var1); // L: 10111
						var10.packetBuffer.writeShort(var2); // L: 10112
						var10.packetBuffer.writeShort(var3); // L: 10113
						Client.packetWriter.addNode(var10); // L: 10114
					}

					if (var0 == 8) { // L: 10116
						var10 = class217.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 10118
						var10.packetBuffer.writeInt(var1); // L: 10119
						var10.packetBuffer.writeShort(var2); // L: 10120
						var10.packetBuffer.writeShort(var3); // L: 10121
						Client.packetWriter.addNode(var10); // L: 10122
					}

					if (var0 == 9) { // L: 10124
						var10 = class217.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 10126
						var10.packetBuffer.writeInt(var1); // L: 10127
						var10.packetBuffer.writeShort(var2); // L: 10128
						var10.packetBuffer.writeShort(var3); // L: 10129
						Client.packetWriter.addNode(var10); // L: 10130
					}

					if (var0 == 10) { // L: 10132
						var10 = class217.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 10134
						var10.packetBuffer.writeInt(var1); // L: 10135
						var10.packetBuffer.writeShort(var2); // L: 10136
						var10.packetBuffer.writeShort(var3); // L: 10137
						Client.packetWriter.addNode(var10); // L: 10138
					}

				}
			}
		}
	} // L: 10058 10140
}
