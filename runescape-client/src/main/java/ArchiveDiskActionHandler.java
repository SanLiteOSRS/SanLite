import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1601517815
	)
	static int field4329;
	@ObfuscatedName("aj")
	static boolean field4332;
	@ObfuscatedName("aq")
	static Object field4331;
	@ObfuscatedName("ar")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -1258700800
	)
	static int field4334;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4329 = 0; // L: 11
		field4332 = false; // L: 12
		field4331 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 48
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 49
				} // L: 50

				if (var1 != null) { // L: 51
					if (var1.type == 0) { // L: 52
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 53
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 54
							var1.remove(); // L: 55
						} // L: 56
					} else if (var1.type == 1) { // L: 58
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 59
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 60
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 61
						} // L: 62
					}

					synchronized(field4331) { // L: 64
						if ((field4332 || field4329 <= 1) && ArchiveDiskActionHandler_requestQueue.method7336()) { // L: 65
							field4329 = 0; // L: 66
							field4331.notifyAll(); // L: 67
							return; // L: 68
						}

						field4329 = 600; // L: 70
					}
				} else {
					BuddyRankComparator.method2992(100L); // L: 74
					synchronized(field4331) { // L: 75
						if ((field4332 || field4329 <= 1) && ArchiveDiskActionHandler_requestQueue.method7336()) { // L: 76
							field4329 = 0; // L: 77
							field4331.notifyAll(); // L: 78
							return; // L: 79
						}

						--field4329; // L: 81
					}
				}
			}
		} catch (Exception var13) { // L: 86
			class368.RunException_sendStackTrace((String)null, var13); // L: 87
		}
	} // L: 89

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "231374914"
	)
	static void method6981() {
		if (Client.isSpellSelected) { // L: 9994
			Widget var0 = class380.field4414.method6347(ModelData0.field3101, Client.field666); // L: 9995
			if (var0 != null && var0.onTargetLeave != null) { // L: 9996
				ScriptEvent var1 = new ScriptEvent(); // L: 9997
				var1.widget = var0; // L: 9998
				var1.args = var0.onTargetLeave; // L: 9999
				WorldMapSectionType.runScriptEvent(var1); // L: 10000
			}

			Client.field554 = -1; // L: 10002
			Client.isSpellSelected = false; // L: 10003
			FaceNormal.invalidateWidget(var0); // L: 10004
		}
	} // L: 10005
}
