package benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@Fork(5)
@Warmup(iterations = 2, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 3, time = 100, timeUnit = TimeUnit.MILLISECONDS)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarkTest {


    @Benchmark
    public void test1() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(3);
    }

    @Benchmark
    public void test2() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(2);
    }
}
